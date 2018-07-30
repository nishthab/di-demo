package guru.springframework.didemo.controller;

import static org.junit.Assert.*;

import org.junit.*;

import guru.springframework.didemo.conntroller.SetterInjectedController;
import guru.springframework.didemo.service.GreetingServiceImpl;

public class SetterInjectedControllerTest {
	
	SetterInjectedController setterInjectedController;
	
	@Before
	public void setU() {
		this.setterInjectedController = new SetterInjectedController();
		this.setterInjectedController.setGreetingService(new GreetingServiceImpl());

	}
	
	@Test
	public void testGreeting(){
		assertEquals(GreetingServiceImpl.HELLO_GURU,setterInjectedController.sayHello());
	}
	

	
	
	
	

}
