package com.example.fng_drools;

import com.example.fng_drools.service.PermissionService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class FngDroolsApplication {

	private static final Logger logger = Logger.getLogger(PermissionService.class.getName());

	public static void main(String[] args) {
		logger.info("START APP ----------------------------------------------------------");
		SpringApplication.run(FngDroolsApplication.class, args);
	}

}
