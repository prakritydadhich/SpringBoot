package com.infypraks;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.infypraks.dao.PraksDemoDao;
import com.infypraks.model.PraksDemoModel;
import com.infypraks.service.PraksDemoService;


@RunWith(SpringRunner.class)
@SpringBootTest

@AutoConfigureMockMvc
class PraksdemoApplicationTests {
    

	
	@Autowired
	private PraksDemoService service;
	
	@MockBean
	private PraksDemoDao repository;
	
	@Test
	public void fetchAllTest() {
	

		when(repository.getAlldata()).thenReturn(Stream 
				.of(new PraksDemoModel ("star","fail"), new PraksDemoModel("moon","pass")).collect(Collectors.toList()));
	
	             assertEquals(2, service.fetchAll().size());
	             
	}
	
	@Test
	public void addSalesTest(){
		PraksDemoModel model = new PraksDemoModel("love","pass");
		when(repository.save(model)).thenReturn(model);
		assertEquals(model, service.addSales(model));
		
				
	}
	
	@Test
	public void deleteSalesTest(){
//		PraksDemoModel model = new PraksDemoModel("love","pass");
		service.deleteSales(1);
		verify(repository, times(1)).deleteById(1);
	}
	
	
}


