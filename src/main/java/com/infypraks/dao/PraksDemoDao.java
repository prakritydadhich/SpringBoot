package com.infypraks.dao;





import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.infypraks.model.PraksDemoModel;

@Transactional
@Repository
public interface PraksDemoDao {
	PraksDemoModel save(PraksDemoModel sales);
//	ArrayList<PraksDemoModel> findAll();
	void deleteById(Integer id);
	//ArrayList<PraksDemoModel> getAllData();
	List<PraksDemoModel> getAlldata();
	
	//PraksDemoModel Update(Integer id);
	
	void  updateSales(Integer id, PraksDemoModel model);

}
