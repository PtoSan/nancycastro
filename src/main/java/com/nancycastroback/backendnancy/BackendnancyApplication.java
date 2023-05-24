package com.nancycastroback.backendnancy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendnancyApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendnancyApplication.class, args);
		System.out.println(org.hibernate.Version.getVersionString());
	}

}
