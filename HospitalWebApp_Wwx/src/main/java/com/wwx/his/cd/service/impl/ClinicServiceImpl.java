package com.wwx.his.cd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wwx.his.cd.mapper.IClinicMapper;
import com.wwx.his.cd.model.ClinicModel;
import com.wwx.his.cd.service.IClinicService;

@Service
@Transactional  //环绕事务Advice的切入点
public class ClinicServiceImpl implements IClinicService {
	@Autowired
	private IClinicMapper clinicMapper = null;
	@Override
	public int add(ClinicModel cm) throws Exception {
		clinicMapper.insert(cm);
		return cm.getCid();
	}

	@Override
	public void modify(ClinicModel cm) throws Exception {
		clinicMapper.update(cm);
	}

	@Override
	public void delete(ClinicModel cm) throws Exception {
		clinicMapper.delete(cm);
	}

	@Override
	public List<ClinicModel> getListByAll() throws Exception {
		return clinicMapper.selectByAll();
	}

	@Override
	public List<ClinicModel> getListByAllWithPage(int rows, int page) throws Exception {
		return clinicMapper.selectByAllWithPage(rows*(page-1), rows);
	}

	@Override
	public int getCountByAll() throws Exception {
		return clinicMapper.selectCountByAll();
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
	public ClinicModel getByCid(int cid) throws Exception {
		return clinicMapper.selectByCid(cid);
	}

}
