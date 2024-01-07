package in.sg.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sg.beans.Car;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		Car car = context.getBean(Car.class); // --The getBean method is to get the bean object
		System.out.println("-------------------------------------------------------------");
		System.out.println(car.hashCode());
		car.drive();
	}

}
