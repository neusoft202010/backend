package com.wwx.his.pst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wwx.his.pst.model.SickroomModel;
import com.wwx.his.pst.service.ISickroomService;
import com.wwx.his.result.Result;

@CrossOrigin
@RestController
@RequestMapping(value = "/sickroom")
public class SickroomController {
	@Autowired
	private ISickroomService ss = null;
	
	@PostMapping(value = "/add")
	public Result<String> Add(SickroomModel sm) throws Exception{
		ss.add(sm);
		
		Result<String> result = new Result<String>();
		result.setStatus("OK");
		result.setMessage("add success");
		return result;
	}
	
	@PostMapping(value = "/modify")
	public Result<String> Modify(SickroomModel sm) throws Exception{
		ss.modify(sm);
		
		Result<String> result = new Result<String>();
		result.setStatus("200");
		result.setMessage("modify success");
		return result;
	}
	
	@PostMapping(value = "/delete")
	public Result<String> Delete(SickroomModel sm) throws Exception{
		ss.delete(sm);
		
		Result<String> result = new Result<String>();
		result.setStatus("200");
		result.setMessage("delete success");
		return result;
	}
	
	@RequestMapping(value = "/getall")
	public Result<SickroomModel> getAll() throws Exception{
		List<SickroomModel> list = ss.getAll();
		Result<SickroomModel> result = new Result<SickroomModel>();
		result.setList(list);
		result.setMessage("success");
		return result;
	}
}
