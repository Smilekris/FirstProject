package cjw.smile.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/test")
	public String test() throws Exception{
		if(1>0){
			throw new Exception("something error");
		}
		return "Hello Spring boot!I am CJW";
	}
}
