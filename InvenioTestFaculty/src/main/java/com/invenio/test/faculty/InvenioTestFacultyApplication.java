package com.invenio.test.faculty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class InvenioTestFacultyApplication {
	public static ConfigurableApplicationContext context;
	public static ConfigurableApplicationContext getContext() {
		return context;
	}
	public static void main(String[] args) {
		context = SpringApplication.run(InvenioTestFacultyApplication.class, args);
	}
}
