(ns atomist.main
  (:require [ring.adapter.jetty :refer [run-jetty]])
  (:gen-class))

(defn handler [_]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Helloo1234567890123456789012"})

(defn -main [& args]
  (run-jetty handler {:port 4000}))
