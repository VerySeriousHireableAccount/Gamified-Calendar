package com.swe.gamifiedcalendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RestController
public class GamifiedCalendarApplication {
	private static final Logger log = LoggerFactory.getLogger(GamifiedCalendarApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(GamifiedCalendarApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@Bean
	public CommandLineRunner demo(AccountRepository repository) {
		return (args) -> {
			repository.save(new Account("martingarrix", "mg@mg.com", "highOnLife"));
			repository.save(new Account("djsixbeeps", "sixbeeps@sixbeeps.com", "DG"));
			repository.save(new Account("djdill", "dill@dill.com", "laserbeamedit"));

			log.info("All accounts:");
			log.info("-------------------------------");
			for (Account account : repository.findAll()) {
				log.info(account.toString());
			}
			log.info("");

			Account customer = repository.findById(2);
			log.info("Account with ID 2:");
			log.info("--------------------------------");
			log.info(customer.toString());
			log.info("");

			log.info("");
		};
	}
}
