(ns visual-cortex.core
    (:require [ubik.core :as u]
              [cortex.nn.layers :as layers]
              [ubik.hosts :as hosts]))

(defonce host (hosts/default-host {}))

(defn ^:export init []
  (u/draw! (u/scale u/circle 400) host))
