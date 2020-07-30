package com.wwx.his.pst.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.wwx.his.pst.model.TariffModel;



@Mapper
public interface ITariffMapper {
	public void insert(TariffModel tm) throws Exception;
	public void update(TariffModel tm) throws Exception;
	public void delete(TariffModel tm) throws Exception;
	
	public List<TariffModel> selectByAllWithPage(@Param("start") int start, @Param("rows") int rows) throws Exception;
	public int selectCountByAll() throws Exception;
	
	public List<TariffModel> selectByAll() throws Exception;
	public TariffModel selectByNum(int num) throws Exception;
	public TariffModel selectByNumWithEmployees(int num) throws Exception;
}
