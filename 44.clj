(fn [n s]
  (let [m (count s)
        p (mod n m)]
    (flatten (reverse (split-at p s)))))
