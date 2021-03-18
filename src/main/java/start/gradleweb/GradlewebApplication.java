package start.gradleweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class GradlewebApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradlewebApplication.class, args);
	}

}
