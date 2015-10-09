# clj-chatwork-client

A Clojure library for Chatwork API.

## Usage

Leiningen 2 has been used with this project.


    lein deps

    lein repl


Post message to Chatwork

    (use 'clj-chatwork-client.core)

    (def room-id "YOUR-ROOMID-HERE" )

    (def api-key "YOUR-API-KEY-HERE" )

    (post-chatwork "YOUR-MESSAGE" room-id api-key)

## License

Distributed under the Eclipse Public License, the same as Clojure.
