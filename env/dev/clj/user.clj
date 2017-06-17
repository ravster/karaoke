(ns user
  (:require [mount.core :as mount]
            [karaoke.figwheel :refer [start-fw stop-fw cljs]]
            karaoke.core))

(defn start []
  (mount/start-without #'karaoke.core/repl-server))

(defn stop []
  (mount/stop-except #'karaoke.core/repl-server))

(defn restart []
  (stop)
  (start))


