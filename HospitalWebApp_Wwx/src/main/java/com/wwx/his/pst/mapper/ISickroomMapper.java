package com.wwx.his.pst.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.wwx.his.pst.model.SickroomModel;



@Mapper
public interface ISickroomMapper {
	public void insert(SickroomModel sm) throws Exception;
	public void update(SickroomModel sm) throws Exception;
	public void delete(SickroomModel sm) throws Exception;
	
	public List<SickroomModel> selectByAllWithPage(@Param("start") int start, @Param("rows") int rows) throws Exception;
	public int selectCountByAll() throws Exception;
	
	public List<SickroomModel> selectByAll() throws Exception;
	public List<SickroomModel> selectAllWithPatients() throws Exception;

	public SickroomModel selectByNum(int num) throws Exception;
	public SickroomModel selectByNumWithEmployees(int num) throws Exception;
}
