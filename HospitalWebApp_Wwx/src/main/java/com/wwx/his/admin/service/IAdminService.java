package com.wwx.his.admin.service;

import com.wwx.his.admin.model.AdminModel;


//管理员业务接口
public interface IAdminService {
	//增加管理员
	public int add(AdminModel am) throws Exception;
	//修改管理员
	public void modify(AdminModel am) throws Exception;
	//根据管理员医生的id（PK）取得指定的管理员对象
	public AdminModel getById(int id) throws Exception;
}
