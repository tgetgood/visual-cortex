(defproject visual-cortex "0.1.0-SNAPSHOT"
  :description "Visual DNN builder leveraging Cortex."
  :url "http://github.com/tgetgood/visual-cortex"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}

  :min-lein-version "2.7.1"

  :dependencies [[macroexpanse/ubik "0.5.0"]
                 [org.clojure/clojure "1.9.0"]
                 [thinktopic/experiment "0.9.22"]
                 [thinktopic/think.tsne "0.1.1"]
                 [org.bytedeco.javacpp-presets/cuda "9.1-7.0-1.4"]]

  :source-paths ["src"]

  :main visual-cortex.core

  :jvm-opts ["-Xmx2000m"]

  :profiles
  {:dev  {:dependencies  [[org.clojure/core.async "0.3.465"]
                          [org.clojure/spec.alpha "0.1.134"]
                          [org.clojure/test.check "0.9.0"]
                          [org.clojure/tools.namespace "0.2.11"]]
          :source-paths  ["src"]}})
