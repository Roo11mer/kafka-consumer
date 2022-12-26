package telran.java45;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KarafkaConsumerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(KarafkaConsumerApplication.class, args);
	}	
	
	@KafkaListener(topics = "pclezsrg-default", groupId = "group_id")
	public void printMessage(String message) {
		System.out.println("Your message = " + message);
	}

}
