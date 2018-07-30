package guru.springframework.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import guru.springframework.didemo.conntroller.ConstructorInjectedController;
import guru.springframework.didemo.conntroller.MyController;
import guru.springframework.didemo.conntroller.PropertyInjectedController;
import guru.springframework.didemo.conntroller.SetterInjectedController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		MyController myCt= (MyController)ctx.getBean("myController");
		String message = myCt.message();
		
		System.out.println(message);
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
