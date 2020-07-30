package com.wwx.his.cd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wwx.his.cd.model.DoctorModel;
import com.wwx.his.cd.service.IDoctorService;
import com.wwx.his.result.Result;
@CrossOrigin
@RestController
@RequestMapping(value="/doctor")
public class DoctorController {
	@Autowired
	private IDoctorService ds = null;
	
	@PostMapping(value="/add")
	public Result<String> add(DoctorModel dm) throws Exception{
		ds.add(dm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("增加医生成功!");
		return result;
	}
	@PostMapping(value="/modify")
	public Result<String> modify(DoctorModel dm) throws Exception{
		ds.modify(dm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("修改医生成功!");
		return result;
	}
	@PostMapping(value="/delete")
	public Result<String> delete(DoctorModel dm) throws Exception{
		ds.delete(dm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("删除医生成功!");
		return result;
	}
	//取得部门列表，分页模式
	@GetMapping(value="/list/all/page")
	public Result<DoctorModel> getListByAllWithPage(@RequestParam(required=false,defaultValue="10") int rows,@RequestParam(required=false,defaultValue="1") int page) throws Exception{
		Result<DoctorModel> result=new Result<DoctorModel>();
		result.setCount(ds.getCountByAll());
		result.setPageCount(ds.getPageCountByAll(rows));
		result.setRows(rows);
		result.setPage(page);
		result.setList(ds.getListByAllWithPage(rows, page));
		
		result.setStatus("OK");
		result.setMessage("取得医生列表分页方式成功!");
		return result;
	}
	@GetMapping(value="/get")
	public Result<DoctorModel> getByDid(@RequestParam(required=true) int Did) throws Exception{
		Result<DoctorModel> result=new Result<DoctorModel>();
		result.setResult(ds.getByDid(Did));
		
		result.setStatus("OK");
		result.setMessage("取得指定医生对象成功!");
		return result;
	}
}
