package com.wwx.his.pst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wwx.his.pst.model.TariffModel;
import com.wwx.his.pst.service.ITariffService;
import com.wwx.his.result.Result;


@CrossOrigin
@RestController
@RequestMapping(value = "/tariff")
public class TariffController {
	@Autowired
	private ITariffService ts = null;
	
	@PostMapping(value = "/add")
	public Result<String> Add(TariffModel tm) throws Exception{
		ts.add(tm);
		
		Result<String> result = new Result<String>();
		result.setStatus("OK");
		result.setMessage("add success");
		return result;
	}
	
	@PostMapping(value = "/modify")
	public Result<String> Modify(TariffModel tm) throws Exception{
		ts.modify(tm);
		
		Result<String> result = new Result<String>();
		result.setStatus("200");
		result.setMessage("modify success");
		return result;
	}
	
	@PostMapping(value = "/delete")
	public Result<String> Delete(TariffModel tm) throws Exception{
		ts.delete(tm);
		
		Result<String> result = new Result<String>();
		result.setStatus("200");
		result.setMessage("delete success");
		return result;
	}
	
	@RequestMapping(value = "/getall")
	public Result<TariffModel> getAll() throws Exception{
		List<TariffModel> list = ts.getAll();
		Result<TariffModel> result = new Result<TariffModel>();
		result.setList(list);
		result.setMessage("success");
		return result;
	}
}
