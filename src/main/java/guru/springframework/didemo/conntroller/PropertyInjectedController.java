package guru.springframework.didemo.conntroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.didemo.service.GreetingService;

@Controller
public class PropertyInjectedController {
	
	@Autowired
	@Qualifier("greetingServiceImpl")
	public GreetingService greetingServiceImpl;
	
	public String sayHello(){
		return greetingServiceImpl.sayGreeting();
	}
//	
//	public GreetingServiceImpl getGreetingService(){
//		
//		return greetingService;
//	}
	
	

}
