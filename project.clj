(defproject org.cyverse/dire "0.5.5"
  :description "Erlang-style supervisor error handling for Clojure"
  :url "https://github.com/cyverse-de/dire"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.11.3"]
                 [org.clojure/core.incubator "0.1.4"]
                 [slingshot "0.12.2"]
                 [robert/hooke "1.3.0"]]
  :eastwood {:exclude-linters [:def-in-def :unused-ret-vals]}
  :profiles {:dev {:dependencies [[midje "1.10.10"]
                                  [bultitude "0.2.8"]]}}
  :plugins [[codox "0.10.8"]
            [jonase/eastwood "1.4.3"]
            [lein-ancient "0.7.0"]
            [lein-midje "3.2.2"]]
  :aliases {"midje-test" ["with-profile" "dev" "midje"]})
