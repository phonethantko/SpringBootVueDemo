package com.example.demo;

import com.example.demo.core.controller.TodoController;
import com.example.demo.core.model.Todo;
import com.example.demo.core.repository.TodoRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	ApplicationRunner init(TodoRepository todoRepository) {
		return args -> {
			Stream.of("Sample One",
					  "Sample Two",
					  "Sample Three").forEach(title -> {
					  	Todo todo = new Todo();
					  	todo.setTitle(title);
					  	todoRepository.save(todo);
			});
		};
	}
}
