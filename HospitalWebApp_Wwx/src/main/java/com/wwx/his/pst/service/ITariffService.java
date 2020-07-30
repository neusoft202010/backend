package com.wwx.his.pst.service;

import java.util.List;

import com.wwx.his.pst.model.TariffModel;



public interface ITariffService {
	public void add(TariffModel tm) throws Exception;
	public void modify(TariffModel tm) throws Exception;
	public void delete(TariffModel tm) throws Exception;
	
	public List<TariffModel> getAllWithPage(int rows, int page) throws Exception;
	public int getCountByAll() throws Exception;
	public int getPageCount(int rows) throws Exception; 
	
	public List<TariffModel> getAll() throws Exception;
	public TariffModel getByNum(int num) throws Exception;
}
