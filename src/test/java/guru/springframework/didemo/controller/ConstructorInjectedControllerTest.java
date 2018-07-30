package guru.springframework.didemo.controller;
import org.junit.*;

import guru.springframework.didemo.conntroller.ConstructorInjectedController;
import guru.springframework.didemo.service.GreetingService;
import guru.springframework.didemo.service.GreetingServiceImpl;
import static org.junit.Assert.*;

public class ConstructorInjectedControllerTest {
	
	private ConstructorInjectedController constructorInjectedController;
	
	@Before
	public void setu() throws Exception{

		GreetingService greetingService = new GreetingServiceImpl();
		this.constructorInjectedController = new ConstructorInjectedController(greetingService);
	}
	
	@Test
	public void testGreeting()throws Exception{
		
		assertEquals(GreetingServiceImpl.HELLO_GURU, constructorInjectedController.sayHello());
		
	}
	
	

}
