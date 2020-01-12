package com.infypraks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;






@EnableSwagger2
@SpringBootApplication(scanBasePackages = {"boot.registration"} , exclude = JpaRepositoriesAutoConfiguration.class)
@EnableAutoConfiguration(exclude= HibernateJpaAutoConfiguration.class)
@EntityScan(basePackages="com.infypraks.model")
@ComponentScan

public class PraksdemoApplication {
	public static void main(String[] args) {
	//ConfigurableApplicationContext applicationContext = 
		SpringApplication.run(PraksdemoApplication.class, args);
		
		//PraksDemoService praksDemoService = applicationContext.getBean("praksDemoService", PraksDemoService.class);
		
//		PraksDemoModel sales = new PraksDemoModel();
//		sales.setId(1);
//		sales.setName("customer1");
//		sales.setStatus("Lucifer");
//		;
//		
//		praksDemoService.addSales(sales);
//		
//		PraksDemoModel sales2 = new PraksDemoModel();
//		sales2.setId(2);
//		sales2.setName("customer2");
//		sales2.setStatus("Morningstar");
//		;
//		praksDemoService.addSales(sales2);
	
}

}
