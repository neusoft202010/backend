package com.wwx.his.admin.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.wwx.his.admin.model.AdminModel;

//管理员的Mapper接口
@Mapper
public interface IAdminMapper {
	//验证管理员身份，返回管理员ID
	public int validate(String name, String password) throws Exception;
	//通过ID取得管理员对象
	public AdminModel selectByName(String name) throws Exception;
}
