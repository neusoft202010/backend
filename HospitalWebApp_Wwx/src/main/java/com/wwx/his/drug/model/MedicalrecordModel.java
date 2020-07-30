package com.wwx.his.drug.model;
import java.io.Serializable;

import org.apache.ibatis.type.Alias;

//病例model类
@Alias("Medicalrecord")
public class MedicalrecordModel implements Serializable{

	private int pid = 0;
	private int did = 0;
	private int drugid = 0;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	

	
	
	public int getDrugid() {
		return drugid;
	}
	public void setDrugid(int drugid) {
		this.drugid = drugid;
	}
}
