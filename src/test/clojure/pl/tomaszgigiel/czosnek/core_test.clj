(ns pl.tomaszgigiel.czosnek.core-test
  (:use [clojure.test])
  (:require [pl.tomaszgigiel.czosnek.core :as czosnek])
  (:require [pl.tomaszgigiel.czosnek.core-test-config :as mytest]))

(use-fixtures :once mytest/once-fixture :each mytest/each-fixture)
