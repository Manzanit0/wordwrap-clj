(ns wordwrap-clj.core)

(defn wrap [text lineLength]
  (apply str (apply concat (interpose ["\n"] (partition-all lineLength text)))))

(defn -main [& args]
  (print (wrap "JUSTaRANDOMSTRINGaskjdfhadskjhfjksadhfkjsadhfAAA" 5)))
