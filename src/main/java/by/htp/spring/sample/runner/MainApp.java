package by.htp.spring.sample.runner;

import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.htp.spring.sample.entity.Car;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("app-context.xml");
		// ApplicationContext appContext2=new
		// ClassPathXmlApplicationContext("app-context.xml");

		Car car = (Car) appContext.getBean("car");

		System.out.println("Car hashcode: " + car.hashCode());
		System.out.println("Car model: " + car.getModel());
		System.out.println("Car engine: " + car.getEngine());
		// System.out.println("Car owners: "+car.getOwners());
		for (String owner : car.getOwners())
			System.out.println(owner);

		for (Integer vin : car.getVins())
			System.out.println(vin);

		for (Entry<String, Integer> s : car.getLocation().entrySet()) {
			System.out.println("location: " + s.getKey());
			System.out.println("year : " + s.getValue());
		}

		Car car2 = (Car) appContext.getBean("newCar");
		System.out.println("Car2 hashcode: " + car2.hashCode());
		System.out.println("Car2 model: " + car2.getModel());
		System.out.println("Car2 engine: " + car2.getEngine());

		((ClassPathXmlApplicationContext) appContext).close();

	}
}
