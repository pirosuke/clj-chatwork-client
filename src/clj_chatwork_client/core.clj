(ns clj-chatwork-client.core
  (:gen-class)
  (:require [clj-http.client :as client]))

(def endpoint-base "https://api.chatwork.com/v1/")

(defn post-chatwork
  "Post message to chatwork room"
  [message room-id api-key]
  (client/post (clojure.string/join [endpoint-base "rooms/" room-id "/messages"])
               {:form-params {:body message}
                :headers {"Content-type" "application/x-www-form-urlencoded"
                          "X-ChatWorkToken" api-key}}))

