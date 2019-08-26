package com.bootcamp.Ujian.Webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bootcamp.controller.Controller;

@SpringBootApplication
public class UjianWebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UjianWebserviceApplication.class, args);
		Controller.getInstance().saveDataGroup();
	}

}
