package com.wwx.his.drug.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.wwx.his.drug.mapper.IIndrugMapper;

import com.wwx.his.drug.model.IndrugModel;

import com.wwx.his.drug.service.IIndrugService;

@Service
@Transactional  //环绕事务Advice的切入点
public class IndrugServiceImpl implements IIndrugService{
	
	@Autowired
	private IIndrugMapper indrugMapper=null;
	@Override
	public int add(IndrugModel im) throws Exception {
		indrugMapper.insert(im);
		return im.getDrugid();
	}

	@Override
	public void modify(IndrugModel im) throws Exception {
		indrugMapper.update(im);
	}

	@Override
	public void delete(IndrugModel im) throws Exception {
		indrugMapper.delete(im);
	}

	@Override
	public List<IndrugModel> getListByAll() throws Exception {
		
		return indrugMapper.selectByAll();
	}

	@Override
	public List<IndrugModel> getListByAllWithPage(int rows, int page) throws Exception {
		
		return indrugMapper.selectByAllWithPage(rows*(page-1), rows);
	}

	@Override
	public int getCountByAll() throws Exception {
		
		return indrugMapper.selectCountByAll();
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
	public IndrugModel getById(int no) throws Exception {
		
		return indrugMapper.selectById(no);
	}

}
