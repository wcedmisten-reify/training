(ns training.exercises.ch01-find-the-gap)

;; Find the smallest natural number not in a given finite set of
;; natural numbers. Suppose the numbers are unsorted:

(def numbers [8 23 9 0 12 11 1 10 13 7 41 4 14 21 5 17 3 19 2 6])

;; How can you find the number in linear time? You can't sort because
;; sorting can't be done in linear time.

;; Not quite linear because the worst case depends on the distance between minimum and maximum values in the list

(defn find-missing [nums]
  (let [minimum (apply min nums)
        maximum (apply max nums)]
    ;; if the smallest number is greater than 0, then 0 is the smallest missing number
    (if (> minimum 0)
      0
      ;; otherwise, find all the missing numbers between `minimum` and `maximum` and find the smallest
      (let [nums-set (set nums)
            range-set (set (range minimum maximum))]
        (apply min (apply disj range-set nums-set))))))

(println (find-missing numbers))
(println (sort numbers))