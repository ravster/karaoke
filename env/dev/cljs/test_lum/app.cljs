(ns ^:figwheel-no-load test-lum.app
  (:require [test-lum.core :as core]
            [devtools.core :as devtools]))

(enable-console-print!)

(devtools/install!)

(core/init!)
