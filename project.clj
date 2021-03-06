(defproject personote "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/java.jdbc "0.7.10"]
                 ;; https://mvnrepository.com/artifact/com.bigchaindb/bigchaindb-driver
                 [com.bigchaindb/bigchaindb-driver "1.2"]
                 [com.layerware/hugsql "0.5.1"]
                 [com.h2database/h2 "1.4.200"]
                 [cljfx "1.6.0"]
                 [cljfx/css "1.1.0"]
                 [seesaw "1.5.0"]]
  :main personote.core
  :repl-options {:init-ns personote.core})
