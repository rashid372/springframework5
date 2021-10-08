package bigdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {
		"com.bigdata",
		"bigdata"})
public class Springframework5Application {

	public static void main(String[] args) {
		SpringApplication.run(Springframework5Application.class, args);
	}

}
