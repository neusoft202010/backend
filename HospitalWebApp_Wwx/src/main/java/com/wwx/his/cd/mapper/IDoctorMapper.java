package com.wwx.his.cd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.wwx.his.cd.model.DoctorModel;

//医生的Mapper接口
@Mapper
public interface IDoctorMapper {
	//增加医生
	public void insert(DoctorModel dm) throws Exception;
	//修改医生
	public void update(DoctorModel dm) throws Exception;
	//删除医生
	public void delete(DoctorModel dm) throws Exception;
	//取得所有医生列表
	public List<DoctorModel> selectByAll() throws Exception;
	//取得所有医生列表，分页模式 参数： start：起始位置； rows:取得记录格式， 
	public List<DoctorModel> selectByAllWithPage(@Param("start") int start,@Param("rows") int rows) throws Exception;
	//取得医生的个数
	public int selectCountByAll() throws Exception;
	//根据医生的did（PK）取得指定的医生对象
	public DoctorModel selectByDid(int didno) throws Exception;
}
