(ns test-lum.core-test
  (:require [cljs.test :refer-macros [is are deftest testing use-fixtures]]
            [pjstadig.humane-test-output]
            [reagent.core :as reagent :refer [atom]]
            [test-lum.core :as rc]))

(deftest test-home
  (is (= true true)))

