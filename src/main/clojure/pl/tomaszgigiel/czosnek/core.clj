(ns pl.tomaszgigiel.czosnek.core
  (:require [clojure.java.jdbc :as jdbc])
  (:require [clojure.string :as str])
  (:require [clojure.tools.logging :as log])
  (:import java.io.PrintWriter)
  (:import java.net.InetAddress)
  (:import org.apache.derby.drda.NetworkServerControl)
  (:gen-class))

(defn classify-database [db-spec]
  (cond (str/starts-with? (db-spec :connection-uri) "jdbc:derby:memory:") :derby-in-memory
        (str/starts-with? (db-spec :connection-uri) "jdbc:derby:") :derby
        :else :other))

(defn start-derby-in-memory [db-spec] (log/info "start-derby-in-memory: " (db-spec :connection-uri)))
(defn start-derby [db-spec] (log/info "start-derby: " (db-spec :connection-uri)))
(defn start-other [db-spec] (log/info "start-other: " (db-spec :connection-uri)))

(defn start-dispatch [db-spec] [(classify-database db-spec) db-spec])
(defmulti start classify-database)
(defmethod start :derby-in-memory [db-spec] (start-derby-in-memory db-spec))
(defmethod start :derby [db-spec] (start-derby db-spec))
(defmethod start :other [db-spec] (start-other db-spec))

(defn execute-load [db-spec file] (log/info "execute-load:" file))
(defn execute-sql [db-spec query] (log/info "execute-sql:" query))
(defn execute-save [db-spec query file] (log/info "execute-save:" query file))

(defn -main
  "czosnek: line files analyzer"
  [& args]
  (log/info "ok"))
