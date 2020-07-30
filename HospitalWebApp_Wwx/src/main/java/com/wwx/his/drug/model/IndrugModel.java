package com.wwx.his.drug.model;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;


//进药记录model类
@Alias("Indrug")
public class IndrugModel implements Serializable{

	private int id = 0;
	private int drugid = 0;
    private Date date = new Date();
	private int quantity = 0;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public int getDrugid() {
		return drugid;
	}
	public void setDrugid(int drugid) {
		this.drugid = drugid;
	}
	
	//date
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
