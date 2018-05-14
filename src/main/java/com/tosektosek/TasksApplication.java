package com.tosektosek;

import com.tosektosek.domain.Task;
import com.tosektosek.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class TasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasksApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(TaskService taskService) {
		return args -> {
			taskService.save(new Task(1L,"Create Spring Boot Application", LocalDate.now(), true));
			taskService.save(new Task(2L,"Create Spring Project Packages", LocalDate.now(), false));
			taskService.save(new Task(3L,"Create Angular Project", LocalDate.now(), false));
			taskService.save(new Task(4L,"Do homework", LocalDate.now(), false));
			taskService.save(new Task(5L,"Create service and repository", LocalDate.now(), true));
			taskService.save(new Task(6L,"Create the requied configuration properties", LocalDate.now(), false));
			taskService.save(new Task(7L,"Check the H2 Console for the initial Data", LocalDate.now(), false));

		};
	}
}
