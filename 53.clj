(fn [coll] 
  (let [a (partition-by #(apply < %) (partition 2 1 coll))
        b (filter (fn [[[x1 x2]]] (< x1 x2)) a)
        c (first (sort-by count > b))] 
    (concat (first c) (map last (rest c)))))

(def x  [1 0 2 3 4 5 1 2 4])

(first (sort-by count > (filter (fn [[x1 x2]] (< x1 x2) (partition-by #(apply < %) (partition 2 1 x))))))
