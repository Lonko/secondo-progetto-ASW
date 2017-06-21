package asw.springcloud.s.mainServiceCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MainServiceCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainServiceCloudApplication.class, args);
	}
}
