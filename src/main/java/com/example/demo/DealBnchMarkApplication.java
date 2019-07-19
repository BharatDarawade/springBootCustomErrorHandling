package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.dao.DealBenchMarkRepository;
import com.example.demo.pojos.Deal;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2

public class DealBnchMarkApplication implements CommandLineRunner{

	

	    @Autowired
	    private DealBenchMarkRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(DealBnchMarkApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		

        repository.save(new Deal("WLK001",12,10000));
        repository.save(new Deal("WLK002",15,50000));
        repository.save(new Deal("WLK003",20,2500000));

	}
	
	 @Bean
	    public Docket api() {
	        return new Docket(DocumentationType.SWAGGER_2).select()
	            .apis(RequestHandlerSelectors
	                .basePackage("com.example.demo.controller"))
	            .paths(PathSelectors.regex("/.*"))
	            .build().apiInfo(apiEndPointsInfo());
	    }
	    private ApiInfo apiEndPointsInfo() {
	        return new ApiInfoBuilder().title("Spring Boot REST API")
	            .description("REST API ")
	            .contact(new Contact("Bharat ", "www.cts.com", "bharatdarawade1134@gmail.com"))
	            .license("Apache 2.0")
	            .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
	            .version("1.0.0")
	            .build();
	    }

}
