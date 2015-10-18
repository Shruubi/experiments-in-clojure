(defn count-list-len [lst] 
  (if (nil? (first lst))
    0
    (+ 1 (count-list-len (rest lst)))))

(count-list-len '(1 2 3 7 8 0))

(defn midpoint [pointa pointb]
  (let [x (/ (+ (pointa :x) (pointb :x)) 2) 
        y (/ (+ (pointa :y) (pointb :y)) 2)]
    {:x x, :y y}))

(midpoint {:x 3, :y 5} {:x 7, :y 5})

(defn find-val [lst val] 
  (cond
    (nil? (first lst)) false
    (= (first lst) val) true
    :else (find-val (rest lst) val)))

(find-val '(1 2 3) 1)