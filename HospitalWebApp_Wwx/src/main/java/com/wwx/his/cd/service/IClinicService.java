package com.wwx.his.cd.service;

import java.util.List;

import com.wwx.his.cd.model.ClinicModel;

//科室的业务接口
public interface IClinicService {
	//增加科室
	public int add(ClinicModel cm) throws Exception;
	//修改科室
	public void modify(ClinicModel cm) throws Exception;
	//删除科室
	public void delete(ClinicModel cm) throws Exception;
	//取得所有科室列表
	public List<ClinicModel> getListByAll() throws Exception;
	//取得所有科室列表,分页模式
	public List<ClinicModel> getListByAllWithPage(int rows, int page) throws Exception;
	//取得科室的个数
	public int getCountByAll() throws Exception;
	//取得科室的显示页数
	public int getPageCountByAll(int rows) throws Exception;	
	//根据科室的cid（PK）取得指定的科室对象
	public ClinicModel getByCid(int cid) throws Exception;
}
