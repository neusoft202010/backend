package com.wwx.his.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wwx.his.admin.model.AdminModel;
import com.wwx.his.admin.service.IAdminService;
import com.wwx.his.result.Result;

@RestController
@RequestMapping(value="/admin")
public class AdminController {
	@Autowired
	private IAdminService as = null;
	
	@PostMapping(value="/add")
	public Result<String> add(AdminModel am) throws Exception{
		as.add(am);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("增加管理员成功!");
		return result;
	}
	@PostMapping(value="/modify")
	public Result<String> modify(AdminModel am) throws Exception{
		as.modify(am);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("修改管理员成功!");
		return result;
	}
	@GetMapping(value="/get")
	public Result<AdminModel> getById(@RequestParam(required=true) int id) throws Exception{
		Result<AdminModel> result=new Result<AdminModel>();
		result.setResult(as.getById(id));
		result.setStatus("OK");
		result.setMessage("取得指定管理员对象成功!");
		return result;
	}

}
