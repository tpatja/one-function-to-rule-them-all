(ns one-function-to-rule-them-all)

(defn concat-elements [a-seq]
  (reduce concat '() a-seq) )

(defn str-cat [a-seq]
  (if (empty? a-seq) ""
      (reduce str (interpose " " a-seq))))

(defn my-interpose [x a-seq]
  (if (<= (count a-seq) 1) a-seq
      (reduce (fn [m n] (flatten [m x n])) a-seq)))

(defn my-count [a-seq]
  (reduce (fn [a _] (inc a)) 0 a-seq))

(defn my-reverse [a-seq]
  (reduce conj '() a-seq))

(defn min-max-element [a-seq]
  [
   (reduce (fn [a b] (if (< a b) a b)) a-seq)
   (reduce (fn [a b] (if (> a b) a b)) a-seq)
  ])

(defn insert [sorted-seq n]
  (if (empty? sorted-seq) (seq [n])
      (loop [acc '()
             s sorted-seq]
        (if (empty? s) (seq (conj (vec acc) n))
         (if (> (first s) n)
           (concat (conj (vec acc) n) s)
           (recur (conj (vec acc) (first s)) (rest s)))))))
         

(defn insertion-sort [a-seq]
  (reduce insert '() a-seq))

(defn parity [a-seq]
  (let [freqs (frequencies a-seq)]
        (set (filter (fn [a] (odd? (get freqs a))) (keys freqs)))))


(defn minus 
  ([x] (- 0 x))
  ([x y] (- x y)))

(defn count-params [x]
  :-)

(defn my-* [x]
  :-)

(defn pred-and [x]
  (fn [x] :-))

(defn my-map [f a-seq]
  [:-])
