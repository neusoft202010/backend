package com.wwx.his.cd.service;

import java.util.List;

import com.wwx.his.cd.model.DoctorModel;

//医院的业务接口
public interface IDoctorService {
	//增加医生
	public int add(DoctorModel dm) throws Exception;
	//修改医生
	public void modify(DoctorModel dm) throws Exception;
	//删除医生
	public void delete(DoctorModel dm) throws Exception;
	//取得所有医生列表
	public List<DoctorModel> getListByAll() throws Exception;
	//取得所有医生列表,分页模式
	public List<DoctorModel> getListByAllWithPage(int rows, int page) throws Exception;
	//取得医生的个数
	public int getCountByAll() throws Exception;
	//取得医生的显示页数
	public int getPageCountByAll(int rows) throws Exception;	
	//根据医生的did（PK）取得指定的医生对象
	public DoctorModel getByDid(int did) throws Exception;
}
