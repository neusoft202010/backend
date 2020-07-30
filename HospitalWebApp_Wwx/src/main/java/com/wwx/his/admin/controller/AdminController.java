package com.wwx.his.admin.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wwx.his.admin.model.AdminModel;
import com.wwx.his.admin.service.IAdminService;
import com.wwx.his.result.Result;
@CrossOrigin
@RestController
@RequestMapping(value="/admin")
public class AdminController {
	@Autowired
	private IAdminService as = null;
	
	@GetMapping(value="/validate/{name}/{password}")
	public Result<AdminModel> validate(@PathVariable(value="name") String name, @PathVariable(value="password") String password, HttpSession session) throws Exception{
		Result<AdminModel> result = new Result<AdminModel>();
		if(as.validate(name, password)){
			result.setStringResult("Y");
			result.setResult(as.getByName(name));
			result.setMessage("管理员验证成功");
			session.setAttribute("user", result.getResult());
		}else {
			result.setStringResult("N");
			result.setMessage("管理员验证失败");
		}
		result.setStatus("OK");
		return result;
	}
	
	@GetMapping(value="/get")
	public Result<AdminModel> getByName(@RequestParam(required=true) String name) throws Exception{
		Result<AdminModel> result=new Result<AdminModel>();
		result.setResult(as.getByName(name));
		result.setStatus("OK");
		result.setMessage("取得指定管理员对象成功!");
		return result;
	}

}
