package com.wwx.his.drug.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.wwx.his.drug.model.IndrugModel;
import com.wwx.his.drug.service.IIndrugService;
import com.wwx.his.restresult.Result;


	
@RestController
@RequestMapping(value="/indrug")
 public class IndrugController {
		
		@Autowired
		private IIndrugService is=null;
		@PostMapping(value="/add")
		public Result<String> add(IndrugModel im) throws Exception{
			is.add(im);
			Result<String> result=new Result<String>();
			result.setStatus("OK");
			result.setMessage("增加进药记录成功!");
			return result;
			
		}
		@PostMapping(value="/modify")
		public Result<String> modify(IndrugModel im) throws Exception{
			is.modify(im);
			Result<String> result=new Result<String>();
			result.setStatus("OK");
			result.setMessage("修改进药记录成功!");
			return result;
		}
		@PostMapping(value="/delete")
		public Result<String> delete(IndrugModel im) throws Exception{
			is.delete(im);
			Result<String> result=new Result<String>();
			result.setStatus("OK");
			result.setMessage("删除进药记录成功!");
			return result;
		}
		//取得部门列表，分页模式
		@GetMapping(value="/list/all/page")
		public Result<IndrugModel> getListByAllWitgPage(@RequestParam(required=false,defaultValue="10") int rows,@RequestParam(required=false,defaultValue="1") int page) throws Exception{
			Result<IndrugModel> result=new Result<IndrugModel>();
			result.setCount(is.getCountByAll());
			result.setPageCount(is.getPageCountByAll(rows));
			result.setRows(rows);
			result.setPage(page);
			result.setList(is.getListByAllWithPage(rows, page));
			
			result.setStatus("OK");
			result.setMessage("取得进药记录列表分页方式成功!");
			return result;
		}
		//@PostMapping(value="/get")
		@GetMapping(value="/get")
		public Result<IndrugModel> getByNo(@RequestParam(required=true) int id) throws Exception{
			Result<IndrugModel> result=new Result<IndrugModel>();
			result.setResult(is.getById(id));
			
			result.setStatus("OK");
			result.setMessage("取得指定进药记录对象成功!");
			return result;
		}

}
