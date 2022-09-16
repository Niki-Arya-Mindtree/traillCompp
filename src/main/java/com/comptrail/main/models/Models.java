package com.comptrail.main.models;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="CompTrail")
public class Models {

	@Id
	private int Id;
	@Column(name="Name")
	private String Name;
	
	public Models() {
		super();
	}
	public Models(int id, String name) {
		super();
		Id = id;
		Name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
	
}
