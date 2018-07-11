package co.com.ath.inquiryportability.config;

import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

/**
 * 
 * @author lmeza
 *
 */

@EnableSwagger2
@Configuration
public class SwaggerConfiguration {


	@Bean
	public Docket mobilePortabilityApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("Api-Documentación")
				.apiInfo(mobilePortabilityApiInfo())
				.select()
				.paths(portabilityPaths())
				.apis(RequestHandlerSelectors
				.any())
				.build()
				.useDefaultResponseMessages(false);
	}

	/**
	 * Api info
	 * 
	 * @return ApiInfo
	 */
	private ApiInfo mobilePortabilityApiInfo() {
		return new ApiInfoBuilder()
				.title("Documentacion Microservicio Consulta Portabilidad Numerica")
				.version("1.0")
				.license("Licencia ATH")
				.build();
	}

	/**
	 * Config paths.
	 *
	 * @return the predicate
	 */
	private Predicate<String> portabilityPaths() {
		return regex("/portabilidad/numerica.*");
	}
}
