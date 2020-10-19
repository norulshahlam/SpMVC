/*
this file replaces the xml-based spring config files. this setting uses class-based 
instead of xml-based
 */

package com.shah;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.shah"}) //find all the class in this folder
public class AnnotationConfig {

/*this config is for view module. whenever a webpage is being directed, 
it will go here and see where is the location and extension. this is possible with the
spring DispatcherServletInitializer directing to this class 
*/
	@Bean
	public InternalResourceViewResolver viewResolver(){
		InternalResourceViewResolver vr =new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/");
		vr.setSuffix(".jsp");
		return vr;
	}
}
