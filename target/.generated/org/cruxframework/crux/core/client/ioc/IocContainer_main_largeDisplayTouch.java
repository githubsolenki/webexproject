package org.cruxframework.crux.core.client.ioc;

import org.cruxframework.crux.core.client.screen.views.View;
import com.google.gwt.core.client.GWT;

public class IocContainer_main_largeDisplayTouch extends org.cruxframework.crux.core.client.ioc.IocContainer {
  public IocContainer_main_largeDisplayTouch(View view){
    super(view);
  }
  public  webexmeeting.client.MainController.MainView getwebexmeeting_client_MainController_MainView(org.cruxframework.crux.core.client.ioc.IoCResource.Scope scope, String subscope){
    webexmeeting.client.MainController.MainView result = _getScope(scope).getValue(new org.cruxframework.crux.core.client.ioc.IocProvider<webexmeeting.client.MainController.MainView>(){
      public webexmeeting.client.MainController.MainView get(){
        return GWT.create(webexmeeting.client.MainController.MainView.class);
      }
    }, "webexmeeting.client.MainController.MainView", subscope, 
    new IocScope.CreateCallback<webexmeeting.client.MainController.MainView>(){
      public void onCreate(webexmeeting.client.MainController.MainView newObject){
      }
    }
    );
    if (scope != org.cruxframework.crux.core.client.ioc.IoCResource.Scope.SINGLETON && result.getBoundCruxViewId() == null){
      result.bindCruxView(this.getBoundCruxViewId());
    }
    return result;
  }
}
