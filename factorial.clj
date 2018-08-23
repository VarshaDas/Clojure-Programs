(ns myfirst.factorial)

(defn Factorial [num]
  (def fact (atom 1))
  (loop [x 1]
    (when (<= x num)
      ( def fact (atom(* @fact x)))
      (recur (  + x 1 ))))
  (println @fact)
  )
(Factorial 5)
