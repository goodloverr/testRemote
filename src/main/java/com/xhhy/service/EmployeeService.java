package com.xhhy.service;

import java.util.List;
import java.util.Map;

import com.xhhy.domain.EmployeeBean;



public interface EmployeeService {
    public List<EmployeeBean> queryAll(List page);
public List<String> querydepartment();
public List<EmployeeBean> queryemployee(Map query);
}
