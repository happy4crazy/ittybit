(defproject ittybit "0.1.0-SNAPSHOT"
  :description "An itty BitTorrent client."
  :url "https://github.com/happy4crazy/ittybit"

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2202"]
                 [org.clojure/core.async "0.1.303.0-886421-alpha"]
                 [org.clojure/core.match "0.2.1"]
                 [om "0.6.2"]]

  :node-dependencies [[bncode "*"]]

  :plugins [[lein-cljsbuild "1.0.3"]
            [lein-npm "0.4.0"]]

  :source-paths ["src"]

  :cljsbuild { 
    :builds [{:id "ittybit"
              :source-paths ["src"]
              :compiler {
                :output-to "ittybit.js"
                :output-dir "out"
                :optimizations :none
                :source-map true}}]})
