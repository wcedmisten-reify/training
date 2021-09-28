(ns training.exercises.ex03-banned-words
  (:require [clojure.string :as str
             clojure.set :as set]))

;; Your mission is to write a function that takes a string and returns
;; true if it contains banned words
(defn contained-banned [input banned]
  (let [input-set (set (clojure.string/split input #" "))
        banned (set banned)]
    (println input-set)
    (println banned)
    (not (empty? (clojure.set/intersection input-set banned)))))

(contained-banned "bananas are delicious" ["bananas" "grape"])
