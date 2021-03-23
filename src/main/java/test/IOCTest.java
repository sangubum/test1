package test;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("ioc1.xml");
		Coffee coffee = (Coffee)ac.getBean("Coffee");
		System.out.println(coffee);
		
	}
}
