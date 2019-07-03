// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/collib01/share/proj/ginger/conf/routes
// @DATE:Wed Jul 03 14:32:45 CDT 2019


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
