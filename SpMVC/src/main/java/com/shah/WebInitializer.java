/* this replaces the xml-config file for dispatcher servlet
 * this config is for view module. whenever a webpage is being directed, 
it will go here and see where is the location and extension. this is possible with the
spring DispatcherServletInitializer directing to this class 
*/

package com.shah;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
	
		return new Class[] {AnnotationConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String [] {"/"} ; //mapping requests. '/' means all requests will go here.
	}

}
