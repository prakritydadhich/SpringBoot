package com.infypraks.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infypraks.dao.PraksDemoDao;
import com.infypraks.model.PraksDemoModel;

@Service
public class PraksDemoService {
	
	@Autowired
	private PraksDemoDao praksdemodao;

	public PraksDemoModel addSales(PraksDemoModel sales) {
		// TODO Auto-generated method stub
		return praksdemodao.save(sales) ;
	}

	public ArrayList<PraksDemoModel> fetchAll() {
		// TODO Auto-generated method stub
		ArrayList<PraksDemoModel> result = (ArrayList<PraksDemoModel>) praksdemodao.getAlldata();
		System.out.println("New Sales added as:" +result);
		return result;
		
	}

	public void deleteSales(Integer id) {
		// TODO Auto-generated method stub
		praksdemodao.deleteById(id);
	}
	
	public void updateSales(Integer id, PraksDemoModel model) {
		// TODO Auto-generated method stub
		praksdemodao.updateSales(id, model);
	}

	

}