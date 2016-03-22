(ns bootstart.core-test
  (:require [clojure.test :refer :all]
            [bootstart.core :refer :all]))

(deftest test1
  (testing "simple test"
    (is (= 1 1))))
