package com.wwx.his.pst.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wwx.his.pst.mapper.ITariffMapper;
import com.wwx.his.pst.model.TariffModel;
import com.wwx.his.pst.service.ITariffService;

@Service
@Transactional
public class TariffServiceImpl implements ITariffService {

	
	@Autowired
	private ITariffMapper tariffMapper = null;
	
	
	@Override
	public void add(TariffModel tm) throws Exception {
		
		tariffMapper.insert(tm);

	}

	@Override
	public void modify(TariffModel tm) throws Exception {
		
		tariffMapper.update(tm);

	}

	@Override
	public void delete(TariffModel tm) throws Exception {
		
		tariffMapper.delete(tm);

	}

	@Override
	public List<TariffModel> getAllWithPage(int rows, int page) throws Exception {
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
	public List<TariffModel> getAll() throws Exception {
		
		return tariffMapper.selectByAll();
	}

	@Override
	public TariffModel getByNum(int num) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
