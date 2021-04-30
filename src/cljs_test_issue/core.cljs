(ns cljs-test-issue.core
  (:require
    [cljs.core.async :refer [<! go]]
    [cljs.test :refer-macros [deftest is testing run-tests use-fixtures async]]))

(run-tests)

(deftest some-test
         (async done
                (go
                  ;; comment out a single test to make this compile
                  (testing "Sanity check" (is (= 1 1)))
                  (testing "Sanity check" (is (= 1 1)))
                  (testing "Sanity check" (is (= 1 1)))
                  (testing "Sanity check" (is (= 1 1)))
                  (testing "Sanity check" (is (= 1 1)))
                  (testing "Sanity check" (is (= 1 1)))
                  (testing "Sanity check" (is (= 1 1)))
                  (testing "Sanity check" (is (= 1 1)))
                  (testing "Sanity check" (is (= 1 1)))
                  (testing "Sanity check" (is (= 1 1)))
                  (testing "Sanity check" (is (= 1 1)))
                  (testing "Sanity check" (is (= 1 1)))
                  (testing "Sanity check" (is (= 1 1)))
                  (testing "Sanity check" (is (= 1 1)))
                  (testing "Sanity check" (is (= 1 1)))
                  (testing "Sanity check" (is (= 1 1)))
                  (testing "Sanity check" (is (= 1 1)))
                  (testing "Sanity check" (is (= 1 1)))
                  (testing "Sanity check" (is (= 1 1)))
                  (testing "Sanity check" (is (= 1 1)))
                  (testing "Sanity check" (is (= 1 1)))
                  (testing "Sanity check" (is (= 1 1)))
                  (done))))