package com.wwx.his.cd.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

//医生Model类
@Alias("Doctor")
public class DoctorModel implements Serializable {
	private int did = 0;
	private int cid = 0;
	private String name = null;
	private String sex = null;
	private int age = 0;
	private String phone = null;
	
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
