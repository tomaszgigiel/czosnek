(defproject czosnek "1.0.0.0-SNAPSHOT"
  :description "czosnek: line files analyzer"
  :url "http://tomaszgigiel.pl"
  :license {:name "Apache License"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/tools.logging "0.4.1"]
                 ;; otherwise log4j.properties has no effect
                 [log4j/log4j "1.2.17" :exclusions [javax.mail/mail
                                                    javax.jms/jms
                                                    com.sun.jmdk/jmxtools
                                                    com.sun.jmx/jmxri]]
                 [org.clojure/java.jdbc "0.7.7"]
                 [org.apache.derby/derby "10.4.2.0"]
                 [org.apache.derby/derbyclient "10.4.2.0"]
                 [org.apache.derby/derbynet "10.4.2.0"]]

  :source-paths ["src/main/clojure"]
  :test-paths ["src/test/clojure"]
  :resource-paths ["src/main/resources"]
  :target-path "target/%s"

  :profiles {:uberjar {:aot :all :jar-name "czosnek.jar" :uberjar-name "czosnek-uberjar.jar"}
             :main-czosnek {:main ^:skip-aot pl.tomaszgigiel.czosnek.core}
             :dev {:resource-paths ["src/test/resources"] :jmx-opts ["-Xmx512m"]}}
  :aliases {"run-main-czosnek-dev" ["with-profile" "main-czosnek,dev" "run"]})

