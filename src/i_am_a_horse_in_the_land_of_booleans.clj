(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude
                  [boolean]))

(defn boolean [x]
  (cond (= x nil) false
    (= x false)   false
    :else         true))

(defn abs [x]
  (max x (- x)))

(defn divides? [divisor n]
    (if (= 0 (mod n divisor))
    true
    false))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (<= 13 age 19)))

(defn generic-doublificate [x]
  (cond
    (number? x) (+ x x)
    (empty? x) nil
    (list? x) (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else true))
(defn leap-year? [year]
  (cond
    (divides? 400 year) true
    (divides? 100 year) false
    (divides? 4 year)   true
    :else               false))

; '_______'
