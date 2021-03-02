package org.tdm.master.tdmmaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication

public class TdmMasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(TdmMasterApplication.class, args);
	}

}
