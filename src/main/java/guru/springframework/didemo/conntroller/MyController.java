package guru.springframework.didemo.conntroller;

import org.springframework.stereotype.Controller;

import guru.springframework.didemo.service.GreetingService;

@Controller
public class MyController {
	
	private GreetingService greetingService;
	
	
	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}



	public String message(){
		
		return greetingService.sayGreeting(); 
	}

}
