package com.oep.OnlineExamPortal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class OnlineExamPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineExamPortalApplication.class, args);
	}

}
