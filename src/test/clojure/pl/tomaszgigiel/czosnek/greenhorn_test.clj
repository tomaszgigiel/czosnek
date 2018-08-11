(ns pl.tomaszgigiel.czosnek.greenhorn-test
  (:use [clojure.test]))

(deftest bigint-test
  (testing "BigInt test"
           ;; 2^1024 (309 digits)
           (is (< (let[a (reduce * (repeat 1024 (bigint 2)))] (list a (+ a 1)))))))
