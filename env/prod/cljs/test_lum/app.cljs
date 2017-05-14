(ns test-lum.app
  (:require [test-lum.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
