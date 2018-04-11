package by.htp.spring.terminator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import by.htp.spring.terminator.targets.KillTarget;
import by.htp.spring.terminator.targets.SaveTarget;
import by.htp.spring.terminator.terminatorModels.T1000;
import by.htp.spring.terminator.terminatorModels.T800;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {
	@Value("${kill.target}")
	private String killTarget;
	
	@Value("${save.target}")
	private String saveTarget;

	@Bean
	KillTarget killTarget() {
		return new KillTarget("Sarah Connor");
	}

	@Bean
	SaveTarget saveTarget() {
		return new SaveTarget("John Connor");
	}

	@Bean
	T800 t800() {
		return new T800(saveTarget());
	}

	@Bean
	T1000 t1000() {
		return new T1000(killTarget());
	}

}
