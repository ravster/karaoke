(ns karaoke.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [karaoke.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[karaoke started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[karaoke has shut down successfully]=-"))
   :middleware wrap-dev})
