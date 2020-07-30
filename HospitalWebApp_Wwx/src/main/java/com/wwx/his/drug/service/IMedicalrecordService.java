package com.wwx.his.drug.service;

import java.util.List;

import com.wwx.his.drug.model.MedicalrecordModel;

//病例的业务接口
public interface IMedicalrecordService {
 
	        //增加病例
			public int add(MedicalrecordModel mm) throws Exception;
			//修改病例
			public void modify(MedicalrecordModel mm) throws Exception;
			//删除病例
			public void delete(MedicalrecordModel mm) throws Exception;
			//取得所有病例列表
			public List<MedicalrecordModel> getListByAll() throws Exception;
			//取得所有病例列表,分页模式
			public List<MedicalrecordModel> getListByAllWithPage(int rows, int page) throws Exception;
			//取得病例的个数
			public int getCountByAll() throws Exception;
			//取得病例的显示页数
			public int getPageCountByAll(int rows) throws Exception;
			
			//根据病例的pid和did（PK）取得指定的部门对象
			public MedicalrecordModel getByPid(int pid) throws Exception;
	
	
	
}
