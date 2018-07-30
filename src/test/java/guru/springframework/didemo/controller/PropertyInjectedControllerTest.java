package guru.springframework.didemo.controller;


import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

import guru.springframework.didemo.conntroller.PropertyInjectedController;
import guru.springframework.didemo.service.GreetingServiceImpl;

public class PropertyInjectedControllerTest {
	
	private PropertyInjectedController propertyInjectedController;
	
	@Before
	public void setUp()throws Exception{
		
		this.propertyInjectedController = new PropertyInjectedController();
		this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
		
		
	}
	@Test
	public void testGreeting() throws Exception{
		
		assertEquals(GreetingServiceImpl.HELLO_GURU,propertyInjectedController.sayHello());
		//GreetingServiceImpl.HELLO_GURU;
		
				
		
	}

}
