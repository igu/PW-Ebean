// @GENERATOR:play-routes-compiler
// @SOURCE:/home/igu/Desktop/PW-Ebean/conf/routes
// @DATE:Sat Jun 15 23:34:07 BRT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
