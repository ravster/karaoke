(ns karaoke.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[karaoke started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[karaoke has shut down successfully]=-"))
   :middleware identity})
