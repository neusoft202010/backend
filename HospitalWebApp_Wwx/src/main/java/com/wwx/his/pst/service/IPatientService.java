package com.wwx.his.pst.service;

import java.util.List;

import com.wwx.his.pst.model.PatientModel;
import com.wwx.his.pst.model.SickroomModel;


public interface IPatientService {
	public void add(PatientModel pm) throws Exception;
	public void modify(PatientModel pm) throws Exception;
	public void delete(PatientModel pm) throws Exception;
	
	public List<PatientModel> getAllWithPage(int rows, int page) throws Exception;
	public int getCountByAll() throws Exception;
	public int getPageCount(int rows) throws Exception; 
	
	public List<PatientModel> getAll() throws Exception;
	public PatientModel getByNum(int num) throws Exception;
	
	public List<PatientModel> selectAllWithSickroom() throws Exception;
	public List<PatientModel> selectAllWithTariffs() throws Exception;
}
