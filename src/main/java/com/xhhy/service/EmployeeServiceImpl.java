package com.xhhy.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xhhy.dao.EmployeeDao;
import com.xhhy.domain.EmployeeBean;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
     private EmployeeDao employeeDao;
	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	

	public List<EmployeeBean> queryAll(List page) {
		return employeeDao.queryAll(page);
	}

	public List<String> querydepartment() {
		return employeeDao.querydepartment();
	}
	
	public List<EmployeeBean> queryemployee(Map query) {
		return employeeDao.queryemployee(query);
	}




	

}
