package lwj.batch1.SpringBatch1;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing
@SpringBootApplication
public class SpringBatch1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatch1Application.class, args);
	}

}
