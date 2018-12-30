package tn.isetso.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class TestController {

	
	@GetMapping("/tests")
	public Test Tasks(){
		Test t = new Test("bjr");
		return t;
	}

}
