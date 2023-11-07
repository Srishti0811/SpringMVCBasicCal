package com.srishti;


//http://localhost:8080/SpringMVC/index.jsp 

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.srishti.services.OperationService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
/* @RequestMapping(path = "/add") */

public class AddController {

	@RequestMapping("/cal") //Or  @RequestMapping(method=RequestMethod.GET) and uncomment above requestMapping path
	public ModelAndView add(@RequestParam("t1") int num1, @RequestParam("t2") int num2,
			@RequestParam ("operator") String operator, HttpServletRequest request, HttpServletResponse response) {
		 
		 
		 //Use @RequestParam to avoid additional steps below:
//		 int num1 = Integer.parseInt(request.getParameter("t1"));
//		 int num2 = Integer.parseInt(request.getParameter("t2"));
		 
	//	 int sum = num1+ num2; //not good to do all the process in Controller - instead create a service class.
		 
		 OperationService service = new OperationService();
		 
		 double sum = service.cal(num1, num2, operator);
		 
		 ModelAndView mv = new ModelAndView();
		 mv.setViewName("output.jsp"); //don't mention extension name - addResult.jsp. Where to mention what we are using. Mention it in DispatcherConfig.java
		 mv.addObject("output", sum);
		 
		return mv;
	}
	 
}
