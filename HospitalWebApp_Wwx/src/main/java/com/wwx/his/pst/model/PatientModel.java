package com.wwx.his.pst.model;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.type.Alias;

@Alias("Patient")
public class PatientModel implements Serializable {
	
	private int pid = 0;
	private int sid = 0;
	private String name = null;
	private String sex = null;
	private int age = 0;
	private String phone = null;
	
	private SickroomModel sickroom = null;
	private List<TariffModel> tariffs = null;
	
	public SickroomModel getSm() {
		return sickroom;
	}
	public void setSm(SickroomModel sickroom) {
		this.sickroom = sickroom;
	}
	public List<TariffModel> getList() {
		return tariffs;
	}
	public void setList(List<TariffModel> tariffs) {
		this.tariffs = tariffs;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
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

