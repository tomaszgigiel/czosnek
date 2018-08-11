(ns pl.tomaszgigiel.czosnek.core-test-config
  (:use [clojure.test])
  (:require [pl.tomaszgigiel.czosnek.core :as czosnek]))

(defn setup [] ())
(defn teardown [] ())

(defn once-fixture [f]
  (setup)
  (f)
  (teardown))

(defn each-fixture [f]
  (setup)
  (f)
  (teardown))
