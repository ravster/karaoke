(ns test-lum.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [test-lum.core-test]))

(doo-tests 'test-lum.core-test)

