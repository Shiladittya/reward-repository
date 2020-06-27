package com.wtw.reward;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync(proxyTargetClass = true)
@SpringBootApplication
@ComponentScan({"com.nfdil.*"})
public class RewardRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RewardRestServiceApplication.class, args);
	}

}
