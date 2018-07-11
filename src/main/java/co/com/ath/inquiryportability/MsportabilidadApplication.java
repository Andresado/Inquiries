package co.com.ath.inquiryportability;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * 
 * @author lmeza
 *
 */
@SpringBootApplication
@EnableSwagger2
public class MsportabilidadApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsportabilidadApplication.class, args);
	}
}
