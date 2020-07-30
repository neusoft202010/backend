package com.wwx.his.pst.model;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.type.Alias;

@Alias("Sickroom")
public class SickroomModel implements Serializable {

	private int sid = 0;
	private String max = null;
	
	private List<PatientModel> patients = null;
	
	public List<PatientModel> getList() {
		return patients;
	}
	public void setList(List<PatientModel> list) {
		this.patients = list;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getMax() {
		return max;
	}
	public void setMax(String max) {
		this.max = max;
	}
	
}
