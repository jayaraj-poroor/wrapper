(defproject com.generuse/wrapper "0.1.0-SNAPSHOT"
  :description "Generuse wrapper for dev purposes"
  :url "http://generuse.com"
  :license {:name "GNU Affero General Public License 3.0"
            :url "http://www.gnu.org/licenses/agpl-3.0.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
  				 [com.generuse/generuse "0.5.0-SNAPSHOT"]
  				]
  :main generuse.wrapper
  :aot  [generuse.wrapper]
  :repositories {"sonatype-oss-public" "https://oss.sonatype.org/content/groups/public/"}  
 )
