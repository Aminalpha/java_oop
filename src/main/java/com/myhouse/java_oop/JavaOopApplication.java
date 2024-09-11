package com.myhouse.java_oop;

import ch.qos.logback.classic.pattern.ClassOfCallerConverter;
import com.myhouse.java_oop.entity.Todo;
import com.myhouse.java_oop.share.TodoStatut;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class JavaOopApplication {

	public static void main(String[] args) {

		SpringApplication.run(JavaOopApplication.class, args);
		Todo todo1 = new Todo();
		Todo todo2 = new Todo("Formation Java", "Description Spring boot", LocalDate.now(), TodoStatut.CREATED);
		Todo todo3 = new Todo();
		todo3.setDescription("Todo 3");
		todo3.setTitre("Titre todo 3");
		todo3.setDateCreation(LocalDate.now());
		todo3.setStatut(TodoStatut.CREATED);

		System.out.println(todo1.getTitre());
		System.out.println(todo2.getTitre());
		System.out.println(todo3.toString());


	}



}
