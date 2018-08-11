(ns pl.tomaszgigiel.czosnek.core-test
  (:use [clojure.test])
  (:require [pl.tomaszgigiel.czosnek.core :as czosnek])
  (:require [pl.tomaszgigiel.czosnek.core-test-config :as mytest]))

(use-fixtures :once mytest/once-fixture)
(use-fixtures :each mytest/each-fixture)

(deftest classify-database-test
  (testing ":derby-in-memory test" (is (= :derby-in-memory (czosnek/classify-database {:connection-uri "jdbc:derby:memory:dummy;create=true"}))))
  (testing ":derby test" (is (= :derby (czosnek/classify-database {:connection-uri "jdbc:derby:dummy;create=true"}))))
  (testing ":other test" (is (= :other (czosnek/classify-database {:connection-uri "jdbc:oracle:thin:scott/tiger@//myhost:1521/myservicename"})))))

(deftest start-test
  (testing ":derby-in-memory test" (is (= nil (czosnek/start {:connection-uri "jdbc:derby:memory:dummy;create=true"}))))
  (testing ":derby test" (is (= nil (czosnek/start {:connection-uri "jdbc:derby:dummy;create=true"}))))
  (testing ":other test" (is (= nil (czosnek/start {:connection-uri "jdbc:oracle:thin:scott/tiger@//myhost:1521/myservicename"})))))
