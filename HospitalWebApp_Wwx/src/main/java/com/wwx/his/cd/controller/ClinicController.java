package com.wwx.his.cd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wwx.his.cd.model.ClinicModel;
import com.wwx.his.cd.service.IClinicService;
import com.wwx.his.result.Result;
@CrossOrigin
@RestController
@RequestMapping(value="/clinic")
public class ClinicController {
	@Autowired
	private IClinicService cs = null;
	
	@PostMapping(value="/add")
	public Result<String> add(ClinicModel cm) throws Exception{
		cs.add(cm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("增加科室成功!");
		return result;
	}
	@PostMapping(value="/modify")
	public Result<String> modify(ClinicModel cm) throws Exception{
		cs.modify(cm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("修改科室成功!");
		return result;
	}
	@PostMapping(value="/delete")
	public Result<String> delete(ClinicModel cm) throws Exception{
		cs.delete(cm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("删除科室成功!");
		return result;
	}
	//取得部门列表，分页模式
	@GetMapping(value="/list/all/page")
	public Result<ClinicModel> getListByAllWithPage(@RequestParam(required=false,defaultValue="10") int rows,@RequestParam(required=false,defaultValue="1") int page) throws Exception{
		Result<ClinicModel> result=new Result<ClinicModel>();
		result.setCount(cs.getCountByAll());
		result.setPageCount(cs.getPageCountByAll(rows));
		result.setRows(rows);
		result.setPage(page);
		result.setList(cs.getListByAllWithPage(rows, page));
		
		result.setStatus("OK");
		result.setMessage("取得科室列表分页方式成功!");
		return result;
	}
	@GetMapping(value="/get")
	public Result<ClinicModel> getByCid(@RequestParam(required=true) int cid) throws Exception{
		Result<ClinicModel> result=new Result<ClinicModel>();
		result.setResult(cs.getByCid(cid));
		
		result.setStatus("OK");
		result.setMessage("取得指定科室对象成功!");
		return result;
	}
}
