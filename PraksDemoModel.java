package com.infypraks.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;

@Entity
@Table(name="SALES")
public class PraksDemoModel {
	
	

	@Override
	public String toString() {
		return "PraksDemoModel [id=" + id + ", name=" + name + ", status=" + status + "]";
	}
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	public int id;
	@Column()
	public String name;
	@Column()
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
