package com.wwx.his.cd.model;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.type.Alias;

//科室Model类
@Alias("Clinic")
public class ClinicModel implements Serializable {
	private int cid = 0;
	private String name = null;
	//科室关联的医生集合
	private List<DoctorModel> doctors = null;
	
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
}
