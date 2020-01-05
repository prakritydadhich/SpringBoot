package com.infypraks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.infypraks.model.PraksDemoModel;
import com.infypraks.service.PraksDemoService;

@SpringBootApplication
@EnableAutoConfiguration(exclude=HibernateJpaAutoConfiguration.class)
public class PraksdemoApplication {
	public static void main(String[] args) {
	ConfigurableApplicationContext applicationContext = 
		SpringApplication.run(PraksdemoApplication.class, args);
		
		PraksDemoService praksDemoService = applicationContext.getBean("praksDemoService", PraksDemoService.class);
		
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