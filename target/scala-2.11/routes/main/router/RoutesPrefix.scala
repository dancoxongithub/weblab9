
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/playlab_crud-part1/conf/routes
// @DATE:Tue Nov 29 16:40:03 GMT 2016


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
