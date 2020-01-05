package com.infypraks.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infypraks.model.PraksDemoModel;

@Repository
public class PraksDemoDaoImpl implements PraksDemoDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public PraksDemoModel save(PraksDemoModel sales) {
		try {
			sessionFactory.getCurrentSession().persist(sales);
			return sales;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return sales;
	}

	@Override
	public ArrayList<PraksDemoModel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}
}
