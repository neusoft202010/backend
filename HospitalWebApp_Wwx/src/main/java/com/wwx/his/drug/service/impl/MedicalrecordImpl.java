package com.wwx.his.drug.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.wwx.his.drug.mapper.IMedicalrecordMapper;
import com.wwx.his.drug.model.MedicalrecordModel;
import com.wwx.his.drug.service.IMedicalrecordService;

@Service
@Transactional  //环绕事务Advice的切入点
public class MedicalrecordImpl implements IMedicalrecordService{
	
	@Autowired
	private IMedicalrecordMapper medicalrecorderMapper=null;
	@Override
	public int add(MedicalrecordModel mm) throws Exception {
		medicalrecorderMapper.insert(mm);
		return mm.getPid();
	}

	@Override
	public void modify(MedicalrecordModel mm) throws Exception {
		medicalrecorderMapper.update(mm);
	}

	@Override
	public void delete(MedicalrecordModel mm) throws Exception {
		medicalrecorderMapper.delete(mm);
	}

	@Override
	public List<MedicalrecordModel> getListByAll() throws Exception {
		
		return medicalrecorderMapper.selectByAll();
	}

	@Override
	public List<MedicalrecordModel> getListByAllWithPage(int rows, int page) throws Exception {
		
		return medicalrecorderMapper.selectByAllWithPage(rows*(page-1), rows);
	}

	@Override
	public int getCountByAll() throws Exception {
		
		return medicalrecorderMapper.selectCountByAll();
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
	public MedicalrecordModel getByPDid(int no,int nh) throws Exception {
		
		return medicalrecorderMapper.selectByPDid(no,nh);
	}

}
