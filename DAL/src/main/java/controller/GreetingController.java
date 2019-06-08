package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@RequestMapping("/")
	public String home() {
		System.out.println("Entered into home()");
	return "Spring boot is working!";
	}

}
