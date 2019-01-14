(ns wordwrap-clj.core-test
  (:require [clojure.test :refer :all]
            [wordwrap-clj.core :refer :all]))

(deftest test-simple-wrap
  (testing "wraps a word with 2 characters in lines of 1"
    (is (= "X\nX" (wrap "XX" 1)))))

(deftest test-wrap-multiple-lines
  (testing "wraps a word with 5 characters in lines of 2"
    (is (= "XX\nXX\nXX" (wrap "XXXXXX" 2)))))

(deftest test-wrap-uncompleted-final-line
  (testing "wraps a word with 5 characters in lines of 2"
    (is (= "XX\nXX\nX" (wrap "XXXXX" 2)))))
