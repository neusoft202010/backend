package com.wwx.his.drug.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.wwx.his.drug.model.MedicalrecordModel;
import com.wwx.his.drug.service.IMedicalrecordService;
import com.wwx.his.restresult.Result;
@CrossOrigin
@RestController
@RequestMapping(value="/medicalrecord")
public class MedicalrecordController {

	@Autowired
	private IMedicalrecordService ms=null;
	@PostMapping(value="/add")
	public Result<String> add(MedicalrecordModel mm) throws Exception{
		ms.add(mm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("增加病例成功!");
		return result;
		
	}
	@PostMapping(value="/modify")
	public Result<String> modify(MedicalrecordModel mm) throws Exception{
		ms.modify(mm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("修改病例成功!");
		return result;
	}
	@PostMapping(value="/delete")
	public Result<String> delete(MedicalrecordModel mm) throws Exception{
		ms.delete(mm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("删除病例成功!");
		return result;
	}
	//取得部门列表，分页模式
	@GetMapping(value="/list/all/page")
	public Result<MedicalrecordModel> getListByAllWitgPage(@RequestParam(required=false,defaultValue="10") int rows,@RequestParam(required=false,defaultValue="1") int page) throws Exception{
		Result<MedicalrecordModel> result=new Result<MedicalrecordModel>();
		result.setCount(ms.getCountByAll());
		result.setPageCount(ms.getPageCountByAll(rows));
		result.setRows(rows);
		result.setPage(page);
		result.setList(ms.getListByAllWithPage(rows, page));
		
		result.setStatus("OK");
		result.setMessage("取得病例列表分页方式成功!");
		return result;
	}
	@GetMapping(value="/get")
	public Result<MedicalrecordModel> getByNo(@RequestParam(required=true) int pid) throws Exception{
		Result<MedicalrecordModel> result=new Result<MedicalrecordModel>();
		result.setResult(ms.getByPid(pid));
		
		result.setStatus("OK");
		result.setMessage("取得指定病例对象成功!");
		return result;
	}
	
	
	
}
