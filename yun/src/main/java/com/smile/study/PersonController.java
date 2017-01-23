package com.smile.study;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@RequestMapping("/test")
	public String one(){
		return "hello springboot!";
	}

}
