(ns pl.tomaszgigiel.czosnek.greenhorn-test
  (:require [pl.tomaszgigiel.czosnek.core :as czosnek])
  (:use [clojure.test])
  (:require [pl.tomaszgigiel.czosnek.core-test-config :as mytest]))

(deftest bigint-test
  (testing "BigInt test"
           ;; 2^1024 (309 digits)
           (is (< (let[a (reduce * (repeat 1024 (bigint 2)))] (list a (+ a 1)))))))
