// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/collib01/share/proj/ginger/conf/routes
// @DATE:Wed Jul 03 14:32:45 CDT 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseApiHelpController ApiHelpController = new controllers.ReverseApiHelpController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseApiHelpController ApiHelpController = new controllers.javascript.ReverseApiHelpController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
