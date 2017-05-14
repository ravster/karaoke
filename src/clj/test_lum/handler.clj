(ns test-lum.handler
  (:require [compojure.core :refer [routes wrap-routes]]
            [test-lum.layout :refer [error-page]]
            [test-lum.routes.home :refer [home-routes]]
            [compojure.route :as route]
            [test-lum.env :refer [defaults]]
            [mount.core :as mount]
            [test-lum.middleware :as middleware]))

(mount/defstate init-app
                :start ((or (:init defaults) identity))
                :stop  ((or (:stop defaults) identity)))

(def app-routes
  (routes
    (-> #'home-routes
        (wrap-routes middleware/wrap-csrf)
        (wrap-routes middleware/wrap-formats))
    (route/not-found
      (:body
        (error-page {:status 404
                     :title "page not found"})))))


(defn app [] (middleware/wrap-base #'app-routes))
