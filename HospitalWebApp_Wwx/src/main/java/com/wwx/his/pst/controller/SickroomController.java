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

import com.wwx.his.pst.model.PatientModel;
import com.wwx.his.pst.model.SickroomModel;
import com.wwx.his.pst.service.ISickroomService;
import com.wwx.his.result.Result;


@RestController
@RequestMapping(value = "/sickroom")
@CrossOrigin(origins = {"*", "null"})
public class SickroomController {
	@Autowired
	private ISickroomService ss = null;
	
	@PostMapping(value = "/add")
	public Result<String> Add(@RequestBody SickroomModel sm) throws Exception{
		ss.add(sm);
		
		Result<String> result = new Result<String>();
		result.setStatus("OK");
		result.setMessage("success");
		return result;
	}
	
	@PostMapping(value = "/modify")
	public Result<String> Modify(@RequestBody SickroomModel sm) throws Exception{
		ss.modify(sm);
		
		Result<String> result = new Result<String>();
		result.setStatus("200");
		result.setMessage("success");
		return result;
	}
	
	@PostMapping(value = "/delete")
	public Result<String> Delete(@RequestBody SickroomModel sm) throws Exception{
		ss.delete(sm);
		
		Result<String> result = new Result<String>();
		result.setStatus("200");
		result.setMessage("success");
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
	
	@GetMapping(value = "/view")
	public Result<SickroomModel> getByNum(@RequestParam(required=true) int num) throws Exception{
		SickroomModel sm = ss.getByNum(num);
		Result<SickroomModel> result = new Result<SickroomModel>();
		result.setResult(sm);
		result.setMessage("success");
		return result;
	}
}
