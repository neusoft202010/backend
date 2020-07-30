package com.wwx.his.drug.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.wwx.his.drug.model.MedicalrecordModel;


//病例的Mapper接口（DAO接口）
@Mapper
public interface IMedicalrecordMapper {
	
	
    //增加病例
	public void insert(MedicalrecordModel mm) throws Exception ;		
	//修改病例
	public void update(MedicalrecordModel mm) throws Exception;
	//删除病例
	public void delete(MedicalrecordModel mm) throws Exception;
	//取得所有病例列表
	public List<MedicalrecordModel> selectByAll() throws Exception;
	//取得所有病例列表，分页模式 参数： start：起始位置； rows:取得记录格式， 
	public List<MedicalrecordModel> selectByAllWithPage(@Param("start") int start,@Param("rows") int rows) throws Exception;
	//取得病例的个数
	public int selectCountByAll() throws Exception;
	//根据药物的did和pid（PK）取得指定的药物对象
	public MedicalrecordModel selectByPid(int pid) throws Exception;

}
