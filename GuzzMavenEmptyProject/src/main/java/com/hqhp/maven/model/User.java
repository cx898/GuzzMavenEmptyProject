package com.hqhp.maven.model;

import org.guzz.annotations.Table;



@javax.persistence.Entity
@org.guzz.annotations.Entity(businessName = "user")
@Table(name="tb_user")
public class User extends BaseModel{
	private static final long serialVersionUID = 5871276030465222216L;
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "name : "+ name + "\nage : "+age;
	}
	
}
