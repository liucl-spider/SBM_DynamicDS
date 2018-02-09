package com.liucl.test2.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liucl.test2.service.TestService;


@Controller  
public class SampleController {
	
	
	 @Autowired
	 private TestService testService;
	 
	
	@RequestMapping("/")
    @ResponseBody
    String home() {
		testService.getData();
        return "Hello World!";
    }

}
