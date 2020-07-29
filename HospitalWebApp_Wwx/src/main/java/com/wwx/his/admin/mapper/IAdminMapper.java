package com.wwx.his.admin.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.wwx.his.admin.model.AdminModel;

//管理员的Mapper接口
@Mapper
public interface IAdminMapper {
	//增加管理员
	public void insert(AdminModel am) throws Exception;
	//修改管理员
	public void update(AdminModel am) throws Exception;
	//通过ID取得管理员对象
	public AdminModel selectById(int id) throws Exception;
}
