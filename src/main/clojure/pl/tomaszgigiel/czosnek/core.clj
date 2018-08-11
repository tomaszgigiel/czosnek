(ns pl.tomaszgigiel.czosnek.core
  (:require [clojure.java.jdbc :as jdbc])
  (:require [clojure.string :as str])
  (:require [clojure.tools.logging :as log])
  (:import java.io.PrintWriter)
  (:import java.net.InetAddress)
  (:import org.apache.derby.drda.NetworkServerControl)
  (:gen-class))

(defn -main
  "czosnek: line files analyzer"
  [& args]
  (log/info "ok"))
