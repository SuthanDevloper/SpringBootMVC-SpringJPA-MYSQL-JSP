package com.suthan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Employee {
	@Id
	@GeneratedValue
private Integer id;
	
	private String name;
	private Double sal;
	private Double hra;
	private Double ta;
	private String dept;
	private String addr;

}
