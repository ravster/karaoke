(ns user
  (:require [mount.core :as mount]
            [test-lum.figwheel :refer [start-fw stop-fw cljs]]
            test-lum.core))

(defn start []
  (mount/start-without #'test-lum.core/repl-server))

(defn stop []
  (mount/stop-except #'test-lum.core/repl-server))

(defn restart []
  (stop)
  (start))


