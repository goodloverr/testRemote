package com.xhhy.dao;

import java.util.List;
import java.util.Map;

import com.xhhy.domain.EmployeeBean;

public interface EmployeeDao {

	List<EmployeeBean> queryAll(List page);

	List<String> querydepartment();
	
	List<EmployeeBean> queryemployee(Map query);

}
