package com.wwx.his.pst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wwx.his.pst.model.SickroomModel;
import com.wwx.his.pst.model.TariffModel;
import com.wwx.his.pst.service.ITariffService;
import com.wwx.his.result.Result;



@RestController
@RequestMapping(value = "/tariff")
@CrossOrigin(origins = {"*", "null"})
public class TariffController {
	@Autowired
	private ITariffService ts = null;
	
	@PostMapping(value = "/add")
	public Result<String> Add(@RequestBody TariffModel tm) throws Exception{
		ts.add(tm);
		
		Result<String> result = new Result<String>();
		result.setStatus("OK");
		result.setMessage("success");
		return result;
	}
	
	@PostMapping(value = "/modify")
	public Result<String> Modify(@RequestBody TariffModel tm) throws Exception{
		ts.modify(tm);
		
		Result<String> result = new Result<String>();
		result.setStatus("200");
		result.setMessage("success");
		return result;
	}
	
	@PostMapping(value = "/delete")
	public Result<String> Delete(@RequestBody TariffModel tm) throws Exception{
		ts.delete(tm);
		
		Result<String> result = new Result<String>();
		result.setStatus("200");
		result.setMessage("success");
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
	
	@GetMapping(value = "/view")
	public Result<TariffModel> getByNum(@RequestParam(required=true) int num) throws Exception{
		TariffModel tm = ts.getByNum(num);
		Result<TariffModel> result = new Result<TariffModel>();
		result.setResult(tm);
		result.setMessage("success");
		return result;
	}
}
