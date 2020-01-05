package com.infypraks.dao;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infypraks.model.PraksDemoModel;

@Repository
public interface PraksDemoDao extends CrudRepository<PraksDemoModel,Integer> {
	
}
