(defproject org.clojars.sbowman/clj-apache-http "2.3.1"
 :description "Clojure HTTP library using the Apache HttpClient.  Fix bug with escaped characters in URLs."
 :dev-dependencies [[lein-clojars "0.7.0"]]
 :dependencies [[org.clojure/clojure "1.2.1"]
                [org.clojure/clojure-contrib "1.2.0"]
                [org.apache.httpcomponents/httpcore "4.0.1"]
                [org.apache.httpcomponents/httpmime "4.0.1"]
                [commons-logging/commons-logging "1.1.1"]
                [org.apache.httpcomponents/httpclient "4.0.1"]])
