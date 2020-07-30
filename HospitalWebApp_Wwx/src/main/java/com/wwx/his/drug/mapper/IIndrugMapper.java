package com.wwx.his.drug.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import com.wwx.his.drug.model.IndrugModel;


//进药记录的Mapper接口（DAO接口）
@Mapper
public interface IIndrugMapper {
	
	//增加进药记录
	public void insert(IndrugModel im) throws Exception ;		
	//修改进药记录
	public void update(IndrugModel im) throws Exception;
	//删除进药记录
	public void delete(IndrugModel im) throws Exception;
	//取得所有进药记录列表
	public List<IndrugModel> selectByAll() throws Exception;
	//取得所有进药记录列表，分页模式 参数： start：起始位置； rows:取得记录格式， 
	public List<IndrugModel> selectByAllWithPage(@Param("start") int start,@Param("rows") int rows) throws Exception;
	//取得进药记录的个数
	public int selectCountByAll() throws Exception;
	//根据进药记录的id（PK）取得指定的药物对象
	public IndrugModel selectById(int id) throws Exception;
	

}
