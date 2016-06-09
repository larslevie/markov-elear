(defproject markov-elear "0.1.0"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [overtone/at-at "1.2.0"]
                 [twitter-api "0.7.8"]
                 [environ "1.0.0"]]
  :profiles {:repl {:dependencies [[org.clojure/tools.namespace "0.2.11"]
                                   [proto-repl "0.1.2"]
                                   [proto-repl-charts "0.2.0"]]}
             :uberjar {:aot :all
                       :uberjar-name "markov-elear.jar"}}
  :main markov-elear.generator
  :min-lein-version "2.0.0"
  :plugins [[lein-environ "1.0.0"]])
