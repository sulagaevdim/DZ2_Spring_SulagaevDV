package ru.geekbrains.Spring_Lesson2_DZ_Sulagaev_DV;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@EnableAutoConfiguration
public class SpringLesson2DzSulagaevDvApplication {

	@RequestMapping("/")
	String welcome(){
		return "Добро пожаловать!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringLesson2DzSulagaevDvApplication.class, args);
	}

}
