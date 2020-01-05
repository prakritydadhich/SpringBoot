package com.infypraks.dao;



import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.infypraks.model.PraksDemoModel;

@Repository
public interface PraksDemoDao {
	PraksDemoModel save(PraksDemoModel sales);
	ArrayList<PraksDemoModel> findAll();
	void deleteById(Integer id);
}
