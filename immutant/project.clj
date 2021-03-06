;; Copyright 2014-2017 Red Hat, Inc, and individual contributors.
;;
;; Licensed under the Apache License, Version 2.0 (the "License");
;; you may not use this file except in compliance with the License.
;; You may obtain a copy of the License at
;;
;; http://www.apache.org/licenses/LICENSE-2.0
;;
;; Unless required by applicable law or agreed to in writing, software
;; distributed under the License is distributed on an "AS IS" BASIS,
;; WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
;; See the License for the specific language governing permissions and
;; limitations under the License.

(defproject org.immutant/immutant "2.1.7-SNAPSHOT"
  :description "A catch-all pom that brings in all Immutant libs."
  :plugins [[lein-modules "0.3.11"]]
  :packaging "pom"

  :dependencies [[org.immutant/caching _]
                 [org.immutant/messaging _]
                 [org.immutant/scheduling _]
                 [org.immutant/web _]
                 [org.immutant/transactions _]])
