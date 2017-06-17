(ns ^:figwheel-no-load karaoke.app
  (:require [karaoke.core :as core]
            [devtools.core :as devtools]))

(enable-console-print!)

(devtools/install!)

(core/init!)
