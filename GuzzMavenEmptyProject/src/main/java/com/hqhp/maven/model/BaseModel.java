package com.hqhp.maven.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.guzz.annotations.GenericGenerator;
/**
 * 所有子类model的父类
 * 
 * @author 确实比较男
 * 
 */
@MappedSuperclass
public class BaseModel implements Serializable {
	private static final long serialVersionUID = 8234559363473259125L;
	private String id;
	@Id
	@GeneratedValue(generator = "uuidGen")
	@GenericGenerator(name = "uuidGen", strategy = "uuid")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
