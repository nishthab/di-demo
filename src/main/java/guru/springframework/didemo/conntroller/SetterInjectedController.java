package guru.springframework.didemo.conntroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.didemo.service.GreetingService;

@Controller
public class SetterInjectedController {
	
	
	private GreetingService greetingService;
	
	@Autowired
	@Qualifier("getterGreetingService")
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello(){
		
		return greetingService.sayGreeting();
	}
	
	

}
