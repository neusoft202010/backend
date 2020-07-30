package com.wwx.his.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wwx.his.admin.mapper.IAdminMapper;
import com.wwx.his.admin.model.AdminModel;
import com.wwx.his.admin.service.IAdminService;

@Service
@Transactional  //环绕事务Advice的切入点
public class AdminServiceImpl implements IAdminService {
	@Autowired
	private IAdminMapper adminMapper = null;
	
	@Override
	public AdminModel getByName(String name) throws Exception {
		return adminMapper.selectByName(name);
	}

	@Override
	public boolean validate(String name, String password) throws Exception {
		return adminMapper.validate(name, password) == 1;
	}

}
