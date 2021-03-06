(defproject day8.re-frame/trace "0.1.1-SNAPSHOT"
  :description "Tracing and developer tools for re-frame apps"
  :url         "https://github.com/Day8/re-frame-trace"
  :license     {:name "MIT"}
  :dependencies [[org.clojure/clojure        "1.8.0"]
                 [org.clojure/clojurescript  "1.9.227"]
                 [reagent                    "0.6.0"]
                 [re-frame                   "0.9.0"]
                 [cljsjs/d3 "4.2.2-0"]]
  :deploy-repositories {"releases" :clojars
                        "snapshots" :clojars}
  :profiles {:dev {:dependencies [[binaryage/dirac "RELEASE"]]}})
