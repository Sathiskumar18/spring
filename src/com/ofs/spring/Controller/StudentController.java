package com.ofs.spring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class StudentController {

	
	
	@RequestMapping("/welcome")
	public ModelAndView DataParser()
	{
		

		String view1 = "Hey Hi";
		return new ModelAndView("index", "view1", view1);
		
	}
	
}
