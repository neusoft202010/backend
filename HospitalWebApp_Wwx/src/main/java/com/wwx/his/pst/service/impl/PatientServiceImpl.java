package com.wwx.his.pst.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wwx.his.pst.mapper.IPatientMapper;
import com.wwx.his.pst.model.PatientModel;
import com.wwx.his.pst.service.IPatientService;


@Service
@Transactional
public class PatientServiceImpl implements IPatientService {

	@Autowired
	private IPatientMapper patientMapper = null;
	
	@Override
	public void add(PatientModel pm) throws Exception {
		
		patientMapper.insert(pm);
	}

	@Override
	public void modify(PatientModel pm) throws Exception {
		
		patientMapper.update(pm);
		
	}

	@Override
	public void delete(PatientModel pm) throws Exception {
		
		patientMapper.delete(pm);
		
	}

	@Override
	public List<PatientModel> getAllWithPage(int rows, int page) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCountByAll() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPageCount(int rows) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<PatientModel> getAll() throws Exception {
		
		return patientMapper.selectByAll();
	}

	@Override
	public PatientModel getByNum(int num) throws Exception {
		
		return patientMapper.selectByNum(num);
	}

	@Override
	public List<PatientModel> selectAllWithSickroom() throws Exception {
		
		return patientMapper.selectAllWithSickroom();
	}

	@Override
	public List<PatientModel> selectAllWithTariffs() throws Exception {
		
		return patientMapper.selectAllWithTariffs();
	}

}
