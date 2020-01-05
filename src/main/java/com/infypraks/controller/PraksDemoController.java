package com.infypraks.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.infypraks.model.PraksDemoModel;
import com.infypraks.service.PraksDemoService;

@Controller
@ComponentScan(basePackages="com.infypraks.service")
@RequestMapping(value="/sales" )

public class PraksDemoController {

	
	@Autowired
	private PraksDemoService praksDemoService;
	
@PostMapping(value="/create")	
  public ResponseEntity<PraksDemoModel> addSales(@RequestBody PraksDemoModel sales) {
		return new ResponseEntity<PraksDemoModel>(praksDemoService.addSales(sales), HttpStatus.OK);			
	}

@PutMapping(value="/update")	
public ResponseEntity<PraksDemoModel> updateSales(@RequestBody PraksDemoModel sales) {
		return new ResponseEntity<PraksDemoModel>(praksDemoService.updateSales(sales), HttpStatus.OK);			
	}

@DeleteMapping(value="/delete/{id}")	
public ResponseEntity<String> deleteSales(@PathVariable Integer id) {
		praksDemoService.deleteSales(id);
		return new ResponseEntity<String>("deleted successfully", HttpStatus.OK);			
	}


@SuppressWarnings("rawtypes")
@GetMapping(value="/getall")
public ResponseEntity<ArrayList>getAll(){
    
	return new ResponseEntity<ArrayList>(praksDemoService.fetchAll(), HttpStatus.OK);
	
	
}

}





