package com.wwx.his.cd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.wwx.his.cd.model.ClinicModel;

//科室的Mapper接口
@Mapper
public interface IClinicMapper {
	//增加科室
	public void insert(ClinicModel cm) throws Exception;
	//修改科室
	public void update(ClinicModel cm) throws Exception;
	//删除科室
	public void delete(ClinicModel cm) throws Exception;
	//取得所有科室列表
	public List<ClinicModel> selectByAll() throws Exception;
	//取得所有科室列表，分页模式 参数： start：起始位置； rows:取得记录格式， 
	public List<ClinicModel> selectByAllWithPage(@Param("start") int start,@Param("rows") int rows) throws Exception;
	//取得科室的个数
	public int selectCountByAll() throws Exception;
	//根据科室的cid（PK）取得指定的部门对象
	public ClinicModel selectByCid(int cid) throws Exception;
	//取得指定的科室，并取得其关联的医生集合
	public ClinicModel selectByCidWithEmployees(int cid) throws Exception;
}
