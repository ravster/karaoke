(ns karaoke.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [karaoke.core-test]))

(doo-tests 'karaoke.core-test)

