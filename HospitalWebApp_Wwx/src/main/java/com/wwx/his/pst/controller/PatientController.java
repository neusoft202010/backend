package com.wwx.his.pst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wwx.his.pst.model.PatientModel;
import com.wwx.his.pst.service.IPatientService;
import com.wwx.his.result.Result;

@CrossOrigin
@RestController
@RequestMapping(value = "/patient")
public class PatientController {
	
	@Autowired
	private IPatientService ps = null;
	
	@PostMapping(value = "/add")
	public Result<String> Add(PatientModel pm) throws Exception{
		ps.add(pm);
		
		Result<String> result = new Result<String>();
		result.setStatus("OK");
		result.setMessage("add success");
		return result;
	}
	
	@PostMapping(value = "/modify")
	public Result<String> Modify(PatientModel pm) throws Exception{
		ps.modify(pm);
		
		Result<String> result = new Result<String>();
		result.setStatus("200");
		result.setMessage("modify success");
		return result;
	}
	
	@PostMapping(value = "/delete")
	public Result<String> Delete(PatientModel pm) throws Exception{
		ps.delete(pm);
		
		Result<String> result = new Result<String>();
		result.setStatus("200");
		result.setMessage("delete success");
		return result;
	}
	
	@GetMapping(value = "/getall")
	public Result<PatientModel> getAll() throws Exception{
		List<PatientModel> list = ps.getAll();
		Result<PatientModel> result = new Result<PatientModel>();
		result.setList(list);
		result.setMessage("success");
		return result;
	}
}
