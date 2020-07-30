package com.wwx.his.drug.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.wwx.his.drug.model.DrugModel;

//药物的Mapper接口（DAO接口）
@Mapper
public interface IDrugMapper {
	
	
	        //增加药物
			public void insert(DrugModel dm) throws Exception ;		
			//修改药物
			public void update(DrugModel dm) throws Exception;
			//删除药物
			public void delete(DrugModel dm) throws Exception;
			//取得所有药物列表
			public List<DrugModel> selectByAll() throws Exception;
			//取得所有药物列表，分页模式 参数： start：起始位置； rows:取得记录格式， 
			public List<DrugModel> selectByAllWithPage(@Param("start") int start,@Param("rows") int rows) throws Exception;
			//取得药物的个数
			public int selectCountByAll() throws Exception;
			//根据药物的drugid（PK）取得指定的药物对象
			public DrugModel selectByDrugid(int drugid) throws Exception;
	

}
