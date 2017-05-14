(ns test-lum.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [test-lum.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[test-lum started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[test-lum has shut down successfully]=-"))
   :middleware wrap-dev})
