package guru.springframework.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{
	
	public static final String HELLO_GURU = "Helloo Guru!!! orignal";
	
	public String sayGreeting(){
		return HELLO_GURU;
	}
			
			

}
