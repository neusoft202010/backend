package com.wwx.his.drug.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.wwx.his.drug.model.DrugModel;
import com.wwx.his.drug.service.IDrugService;
import com.wwx.his.restresult.Result;

@CrossOrigin
@RestController
@RequestMapping(value="/drug")
public class DrugController {
	
	@Autowired
	private IDrugService ds=null;
	@PostMapping(value="/add")
	public Result<String> add(DrugModel dm) throws Exception{
		ds.add(dm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("增加药物成功!");
		return result;
		
	}
	@PostMapping(value="/modify")
	public Result<String> modify(DrugModel dm) throws Exception{
		ds.modify(dm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("修改药物成功!");
		return result;
	}
	@PostMapping(value="/delete")
	public Result<String> delete(DrugModel dm) throws Exception{
		ds.delete(dm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("删除药物成功!");
		return result;
	}
	//取得部门列表，分页模式
	@GetMapping(value="/list/all/page")
	public Result<DrugModel> getListByAllWitgPage(@RequestParam(required=false,defaultValue="10") int rows,@RequestParam(required=false,defaultValue="1") int page) throws Exception{
		Result<DrugModel> result=new Result<DrugModel>();
		result.setCount(ds.getCountByAll());
		result.setPageCount(ds.getPageCountByAll(rows));
		result.setRows(rows);
		result.setPage(page);
		result.setList(ds.getListByAllWithPage(rows, page));
		
		result.setStatus("OK");
		result.setMessage("取得药物列表分页方式成功!");
		return result;
	}
	@GetMapping(value="/get")
	public Result<DrugModel> getByDrugid(@RequestParam(required=true) int drugid) throws Exception{
		Result<DrugModel> result=new Result<DrugModel>();
		result.setResult(ds.getByDrugid(drugid));
		
		result.setStatus("OK");
		result.setMessage("取得指定药物对象成功!");
		return result;
	}
	
	

}
