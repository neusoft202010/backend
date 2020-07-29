package com.wwx.his.cd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wwx.his.cd.mapper.IDoctorMapper;
import com.wwx.his.cd.model.DoctorModel;
import com.wwx.his.cd.service.IDoctorService;

@Service
@Transactional  //环绕事务Advice的切入点
public class DoctorServiceImpl implements IDoctorService {
	@Autowired
	private IDoctorMapper doctorMapper = null;
	@Override
	public int add(DoctorModel dm) throws Exception {
		doctorMapper.insert(dm);
		return dm.getDid();
	}

	@Override
	public void modify(DoctorModel dm) throws Exception {
		doctorMapper.update(dm);
	}

	@Override
	public void delete(DoctorModel dm) throws Exception {
		doctorMapper.delete(dm);
	}

	@Override
	public List<DoctorModel> getListByAll() throws Exception {
		return doctorMapper.selectByAll();
	}

	@Override
	public List<DoctorModel> getListByAllWithPage(int rows, int page) throws Exception {
		return doctorMapper.selectByAllWithPage(rows*(page-1), rows);
	}

	@Override
	public int getCountByAll() throws Exception {
		return doctorMapper.selectCountByAll();
	}

	@Override
	public int getPageCountByAll(int rows) throws Exception {
		int count = this.getCountByAll();
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
	public DoctorModel getByDid(int did) throws Exception {
		return doctorMapper.selectByDid(did);
	}

}
