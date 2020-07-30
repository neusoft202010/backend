package com.wwx.his.pst.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wwx.his.pst.mapper.ISickroomMapper;
import com.wwx.his.pst.model.SickroomModel;
import com.wwx.his.pst.service.ISickroomService;


@Service
@Transactional
public class SickroomServiceImpl implements ISickroomService {

	@Autowired
	private ISickroomMapper sickroomMapper = null;
 	
	@Override
	public void add(SickroomModel sm) throws Exception {
		
		sickroomMapper.insert(sm);

	}

	@Override
	public void modify(SickroomModel sm) throws Exception {
		
		sickroomMapper.update(sm);

	}

	@Override
	public void delete(SickroomModel sm) throws Exception {
		
		sickroomMapper.delete(sm);

	}

	@Override
	public List<SickroomModel> getAllWithPage(int rows, int page) throws Exception {
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
	public List<SickroomModel> getAll() throws Exception {
		
		return sickroomMapper.selectByAll();
	}

	@Override
	public SickroomModel getByNum(int num) throws Exception {
		
		return sickroomMapper.selectByNum(num);
	}

	@Override
	public List<SickroomModel> getAllWithPatients() throws Exception {
		
		return sickroomMapper.selectAllWithPatients();
	}

}
