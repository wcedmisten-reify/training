(ns training.exercises.ex05-odds)

;; Write a function (and any helper functions) that calculates the
;; odds of a sum being returned when two n-sided dice are thrown.
;;
;; Examples:
;; (odds 3 6 6) => 1/18
;; (odds 3 4 4) => 1/6
;;
;; In both these examples, 3 is the sum. The other two numbers are the
;; number of sides the dice have.
;;
;; It's definitely doable using just the functions and operators that
;; you've seen so far. Have fun :)
(defn odds
  [total die1 die2]
  (let [combo (for [x (range 1 (inc die1)) y (range 1 (inc die2))] (vector x y))
        numer (count (filter #(= (apply + %) total) combo))
        denom (* die1 die2)]
        (/ numer denom)))


(odds 3 6 6)
(odds 3 4 4)

