package romaniancoder.booking;

import org.jsondoc.spring.boot.starter.EnableJSONDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServlerInitializer;

@SpringBootApplication
@EnableJSONDoc
public class BookingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingDemoApplication.class, args);
	}
}
