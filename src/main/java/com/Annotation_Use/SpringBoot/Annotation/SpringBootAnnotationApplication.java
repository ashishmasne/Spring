package com.Annotation_Use.SpringBoot.Annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAnnotationApplication.class, args);

		System.err.println("Annotation Used successfully");
	}

}
