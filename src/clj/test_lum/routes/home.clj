(ns test-lum.routes.home
  (:require [test-lum.layout :as layout]
            [test-lum.db.core :as db]
            [compojure.core :refer [defroutes GET]]
            [ring.util.http-response :as response]
            [clojure.java.io :as io]))

(defn home-page []
  (layout/render "home.html"))

(defroutes home-routes
  (GET "/" []
       (home-page))
  (GET "/docs" []
       (-> (response/ok (-> "docs/docs.md" io/resource slurp))
           (response/header "Content-Type" "text/plain; charset=utf-8")))
  (GET "/search" []
       (fn [req]
         (-> (db/songs-by
              {:term (str ".*"
                   (get-in req [:params :term])
                   ".*")})
             (response/ok)))))
