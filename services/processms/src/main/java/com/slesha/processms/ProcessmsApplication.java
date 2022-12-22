package com.slesha.processms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class ProcessmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcessmsApplication.class, args);
	}
	@KafkaListener(topics = "enroll", groupId = "group-id")
	public void listen(String message) {
   		System.out.println("Received Messasge in group - group-id: " + message);
	}

}
