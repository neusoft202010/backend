package com.wwx.his.admin.service;

import com.wwx.his.admin.model.AdminModel;


//管理员业务接口
public interface IAdminService {
	//验证管理员身份，返回管理员ID
	public boolean validate(String name, String password) throws Exception;
	//根据管理员医生的id（PK）取得指定的管理员对象
	public AdminModel getByName(String name) throws Exception;
}
