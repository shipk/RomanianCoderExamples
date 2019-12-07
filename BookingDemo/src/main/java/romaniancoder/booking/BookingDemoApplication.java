package romaniancoder.booking;

import org.jsondoc.spring.boot.starter.EnableJSONDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

//import org.springframework.boot.web.support.SpringBootServletInitializer; // 1.5.3
import org.springframework.boot.context.web.SpringBootServletInitializer; // 1.3.3

@SpringBootApplication
@EnableJSONDoc
public class BookingDemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BookingDemoApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(BookingDemoApplication.class);
	}
}
