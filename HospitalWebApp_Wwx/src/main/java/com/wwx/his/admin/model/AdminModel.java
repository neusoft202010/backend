package com.wwx.his.admin.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

//系统管理员的Model
@Alias("Admin")
public class AdminModel implements Serializable {
	private int id=0;
	private String name=null;
	private String password=null;
	private String phone=null;
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
