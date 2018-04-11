package by.htp.spring.terminator.runners;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.htp.spring.terminator.terminatorModels.T1000;
import by.htp.spring.terminator.terminatorModels.T800;
import by.htp.spring.terminator.terminatorModels.Terminator;

public class MainSpring {

	public static void main(String[] args) {
//		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		ApplicationContext context=new ClassPathXmlApplicationContext("terminator-context.xml");
		
		Terminator t800=context.getBean(T800.class);
		t800.showTarget();
		
		Terminator t1000=(T1000) context.getBean("t1000");
		t1000.showTarget();
	}
}
