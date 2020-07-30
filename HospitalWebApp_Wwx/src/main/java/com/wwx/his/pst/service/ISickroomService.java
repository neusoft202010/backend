package com.wwx.his.pst.service;

import java.util.List;


import com.wwx.his.pst.model.SickroomModel;

public interface ISickroomService {
	public void add(SickroomModel sm) throws Exception;
	public void modify(SickroomModel sm) throws Exception;
	public void delete(SickroomModel sm) throws Exception;
	
	public List<SickroomModel> getAllWithPage(int rows, int page) throws Exception;
	public int getCountByAll() throws Exception;
	public int getPageCount(int rows) throws Exception; 
	
	public List<SickroomModel> getAll() throws Exception;
	public SickroomModel getByNum(int num) throws Exception;
	
	public List<SickroomModel> getAllWithPatients() throws Exception;
}
