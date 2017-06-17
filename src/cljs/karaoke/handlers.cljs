(ns karaoke.handlers
  (:require [karaoke.db :as db]
            [re-frame.core :refer [dispatch reg-event-db reg-event-fx]]))

(reg-event-db
  :initialize-db
  (fn [_ _]
    db/default-db))

(reg-event-db
  :set-active-page
  (fn [db [_ page]]
    (assoc db :page page)))

(reg-event-db
  :set-docs
  (fn [db [_ docs]]
    (assoc db :docs docs)))

(reg-event-db
 :good-search-response
 (fn [db [_ response]]
   (assoc db :search-results response)))

(reg-event-fx
 :update-search
 (fn [db [_ term]]
   {:http-xhrio {:method :get
                 :uri "/search"
                 :params {:term term}
                 :response-format (ajax.core/json-response-format {:keywords? true})
                 :on-success [:good-search-response]}}))
