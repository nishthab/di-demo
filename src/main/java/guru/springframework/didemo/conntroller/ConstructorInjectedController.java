package guru.springframework.didemo.conntroller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.didemo.service.GreetingService;

@Controller
public class ConstructorInjectedController {
	
	private GreetingService greetingService;

	//@Autowired //optional for constructor
	public ConstructorInjectedController(@Qualifier("constructorGreetingService")GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello(){
		return greetingService.sayGreeting();
	}
	
	

}
