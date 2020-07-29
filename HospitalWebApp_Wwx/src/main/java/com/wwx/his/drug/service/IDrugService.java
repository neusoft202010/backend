package com.wwx.his.drug.service;

import java.util.List;

import com.wwx.his.drug.model.DrugModel;

//药物的业务接口

public interface IDrugService {


		//增加药物
		public int add(DrugModel dm) throws Exception;
		//修改药物
		public void modify(DrugModel dm) throws Exception;
		//删除药物
		public void delete(DrugModel dm) throws Exception;
		//取得所有药物列表
		public List<DrugModel> getListByAll() throws Exception;
		//取得所有药物列表,分页模式
		public List<DrugModel> getListByAllWithPage(int rows, int page) throws Exception;
		//取得药物的个数
		public int getCountByAll() throws Exception;
		//取得药物的显示页数
		public int getPageCountByAll(int rows) throws Exception;
		
		//根据药物的drugid（PK）取得指定的部门对象
		public DrugModel getByDrugid(int drugidno) throws Exception;
		
			
	
	
	
	
}
