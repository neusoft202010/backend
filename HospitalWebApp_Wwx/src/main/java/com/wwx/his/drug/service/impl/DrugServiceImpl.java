package com.wwx.his.drug.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.wwx.his.drug.mapper.IDrugMapper;
import com.wwx.his.drug.model.DrugModel;
import com.wwx.his.drug.service.IDrugService;



@Service
@Transactional  //环绕事务Advice的切入点
public class DrugServiceImpl implements IDrugService{
	
	@Autowired
	private IDrugMapper drugMapper=null;
	@Override
	public int add(DrugModel dm) throws Exception {
		drugMapper.insert(dm);
		return dm.getDrugid();
	}

	@Override
	public void modify(DrugModel dm) throws Exception {
		drugMapper.update(dm);
	}

	@Override
	public void delete(DrugModel dm) throws Exception {
		drugMapper.delete(dm);
	}

	@Override
	public List<DrugModel> getListByAll() throws Exception {
		
		return drugMapper.selectByAll();
	}

	@Override
	public List<DrugModel> getListByAllWithPage(int rows, int page) throws Exception {
		
		return drugMapper.selectByAllWithPage(rows*(page-1), rows);
	}

	@Override
	public int getCountByAll() throws Exception {
		
		return drugMapper.selectCountByAll();
	}

	@Override
	public int getPageCountByAll(int rows) throws Exception {
		
		int count=this.getCountByAll();
		int pageCount=0;
		if(count%rows==0) {
			pageCount=count/rows;
		}
		else {
			pageCount=count/rows+1;
		}
		
		return pageCount;
	}

	@Override
	public DrugModel getByDrugid(int drugid) throws Exception {
		
		return drugMapper.selectByDrugid(drugid);
	}
	
	

}
