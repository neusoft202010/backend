package com.wwx.his.drug.service;

import java.util.List;

import com.wwx.his.drug.model.IndrugModel;


//进药记录的业务接口
public interface IIndrugService {
	
	     //增加进药记录
		public int add(IndrugModel im) throws Exception;
			//修改进药记录
		public void modify(IndrugModel im) throws Exception;
			//删除进药记录
		public void delete(IndrugModel im) throws Exception;
			//取得所有进药记录列表
		public List<IndrugModel> getListByAll() throws Exception;
			//取得所有进药记录列表,分页模式
		public List<IndrugModel> getListByAllWithPage(int rows, int page) throws Exception;
			//取得进药记录的个数
		public int getCountByAll() throws Exception;
			//取得进药记录的显示页数
		public int getPageCountByAll(int rows) throws Exception;			
			//根据进药记录的id（PK）取得指定的部门对象
		public IndrugModel getById(int id) throws Exception;

}
