package com.wwx.his.drug.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

//药物model类
@Alias("Drug")
public class DrugModel implements Serializable{

	private int drugid = 0;
	private int cost = 0;
	private String name = null;
	
	
	public int getDrugid() {
		return drugid;
	}
	public void setDid(int drugid) {
		this.drugid = drugid;
	}
	
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
