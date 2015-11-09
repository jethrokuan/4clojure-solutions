(fn [& a]
  (reduce #(if (> % %2) % %2) a))
