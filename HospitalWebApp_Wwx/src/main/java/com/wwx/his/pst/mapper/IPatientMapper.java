package com.wwx.his.pst.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.wwx.his.pst.model.PatientModel;


@Mapper
public interface IPatientMapper {
	public void insert(PatientModel pm) throws Exception;
	public void update(PatientModel pm) throws Exception;
	public void delete(PatientModel pm) throws Exception;
	
	public List<PatientModel> selectByAllWithPage(@Param("start") int start, @Param("rows") int rows) throws Exception;
	public int selectCountByAll() throws Exception;
	
	public List<PatientModel> selectByAll() throws Exception;
	public List<PatientModel> selectAllWithSickroom() throws Exception;
	public List<PatientModel> selectAllWithTariffs() throws Exception;
	
	
	public PatientModel selectByNum(int num) throws Exception;
	public PatientModel selectByNumWithEmployees(int num) throws Exception;
}
