package com.srishti;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan({  "com.srishti"  })
public class DispatcherConfig 
{
	 //X
	//remove below and mention .jsp in Controller or use below and remove .jsp in controller
		
//		  @Bean //will give an object of internal resource view resolver public
//		  InternalResourceViewResolver viewResolver() { InternalResourceViewResolver vr
//		  = new InternalResourceViewResolver();
//		  
//		  vr.setViewClass(JstlView.class);
//		  vr.setPrefix("/WEB-INF/"); // since the files are inside WEB-INF we need to
//		  vr.setSuffix(".jsp"); //.jsp or any other can be updated here
//		  
//		  return vr; }
		 
}
