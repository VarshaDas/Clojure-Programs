(ns myfirst.duplicate)

(defn xyz [msg]
  (println (distinct (clojure.string/split msg #""))))
  (xyz "hellopopldllhohhlb")
  
