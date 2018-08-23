(ns myfirst.fibonacci)

(defn Fibonacci [count]
  (def x (atom 0))
  (def y (atom 1))
  (println @x "" @y)
  (loop [i 2]
    (when (<= i count)
      (def z (atom (+ @x @y)))
      (println @z)
      (def x (atom @y))
      (def y (atom @z))
      (recur (+ i 1))
      )))
(Fibonacci 5)
