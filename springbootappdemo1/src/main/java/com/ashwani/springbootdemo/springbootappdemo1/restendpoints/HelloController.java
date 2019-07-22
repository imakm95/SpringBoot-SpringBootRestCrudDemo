package com.ashwani.springbootdemo.springbootappdemo1.restendpoints;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //adds spring rest support
public class HelloController {
	
	@Value("${team.name}")
	private String teamName;
	@Value("${coach.name}")
	private String coachName;
	@GetMapping("/")
	public String sayHello() {
		return "Time on the server "+LocalDateTime.now();
	}
	
//	added for simulating spring-boot-devtools autoreloading feature, any change any file except static files and pom.xml
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run a hard 5k!";
	}
	
// added for accessing custom properties
	@GetMapping("/teaminfo")
	public String teamInfo() {
		return "Team: "+teamName+", Coach: "+coachName;
	}
}
