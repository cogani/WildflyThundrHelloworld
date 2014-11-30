

import static com.threewks.thundr.route.RouteType.GET;

import com.threewks.thundr.action.method.MethodAction;
import com.threewks.thundr.injection.BaseModule;
import com.threewks.thundr.injection.UpdatableInjectionContext;
import com.threewks.thundr.module.DependencyRegistry;
import com.threewks.thundr.route.Route;
import com.threewks.thundr.route.Routes;
import com.threewks.thundr.platform.DefaultPlatformModule;
import com.threewks.web.MyController;

public class ApplicationModule extends BaseModule {
	  @Override
	  public void configure(UpdatableInjectionContext injectionContext) {
	    super.configure(injectionContext);
	    // Get the routes out of the injection context
	    Routes routes = injectionContext.get(Routes.class);
			
	    // add desired routes
	    routes.addRoute(new Route(GET, "/WildflyThundrHelloworld/", null), new MethodAction(MyController.class, "home"));
	  }
	  
	  
	  @Override
		public void requires(DependencyRegistry dependencyRegistry) {
			super.requires(dependencyRegistry);
			dependencyRegistry.addDependency(DefaultPlatformModule.class);
		}
	}