package com.wwx.his.pst.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;


@Alias("Tariff")
public class TariffModel implements Serializable {

	private int tid = 0;
	private int pid = 0;
	private String pname = null;
	private String cost = null;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return pname;
	}
	public void setName(String pname) {
		this.pname = pname;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	
}
