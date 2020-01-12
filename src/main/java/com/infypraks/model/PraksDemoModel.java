package com.infypraks.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Sales")
public class PraksDemoModel {
	
	

	
	public PraksDemoModel(String string, String string2) {
		// TODO Auto-generated constructor stub
		this.name=string;
		this.status=string2;
	}
	@Override
	public String toString() {
		return "PraksDemoModel [id=" + id + ", name=" + name + ", status=" + status + "]";
	}
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	public int id;
	public String name;
	public String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}


}
