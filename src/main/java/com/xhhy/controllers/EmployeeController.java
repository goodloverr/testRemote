package com.xhhy.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xhhy.domain.EmployeeBean;
import com.xhhy.service.EmployeeService;
import com.xhhy.util.Util;




@Controller
@RequestMapping("employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	 Util util = new Util();
	@RequestMapping("queryList.do")
	public ModelAndView listUser(int pagenow){
		List<Integer> page = util.pagelist(pagenow, pagenow+10);
		List<EmployeeBean> employees = employeeService.queryAll(page);
		List<String> department = employeeService.querydepartment();
		ModelAndView mav = new ModelAndView("/datamsg/demo1/list.jsp");
		mav.addObject("department",department);
		mav.addObject("employees",employees);
		return mav;
	}
	
	public ModelAndView EmployeeQuery (String dep,String em_name,String file_state,String timestart,String timeover){
		Map query = util.employeequerylist(dep, em_name,file_state, timestart, timeover);
		List<EmployeeBean> employees = employeeService.queryemployee(query);
		ModelAndView mav = new ModelAndView("/datamsg/demo1/list.jsp");
		mav.addObject("employees",employees);
		mav.addObject("queryimage",query);
		return mav;
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}



	
	
	
}
