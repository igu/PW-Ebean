// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/basico/Desktop/lista/conf/routes
// @DATE:Wed Jun 12 16:12:51 BRT 2019


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
