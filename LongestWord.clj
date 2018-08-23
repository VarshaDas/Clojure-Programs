(ns myfirst.findlongword)

(defn findlongest [msg]
  
  (def countnumofwords (count ( clojure.string/split msg #"\s" )))
  (def initval (atom ( count (nth (clojure.string/split msg #"\s")0) )))
  (loop [x 0]
    (when (< x countnumofwords)
      (def val (atom ( count (nth (clojure.string/split msg #"\s")x) )))      
      (if (> @val @initval)
      (do(def initval (atom @val))
        (def word (atom (nth (clojure.string/split msg #"\s")x))) 
        ))
      (recur (inc x ))
      )
    )
  (println @word)
  )
(findlongest "World is a beautiful place to live in")
