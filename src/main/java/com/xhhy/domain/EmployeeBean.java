package com.xhhy.domain;

import java.io.Serializable;

public class EmployeeBean implements Serializable{
	private int employee_Id;//员工id
	private String employee_Department;//员工部门
	private String employee_File_Number;//档案编号
	private String employee_Name;//员工姓名
	private String employee_Sex;//员工性别
	private String employee_Position;//员工职位
	private String employee_Post;//员工职称
	private String employee_Telphone;//员工电话
	private String employee_File_States;//员工档案状态
	private String employee_File_Times;//建档日期
	public int getEmployee_Id() {
		return employee_Id;
	}
	public void setEmployee_Id(int employee_Id) {
		this.employee_Id = employee_Id;
	}
	public String getEmployee_Department() {
		return employee_Department;
	}
	public void setEmployee_Department(String employee_Department) {
		this.employee_Department = employee_Department;
	}
	public String getEmployee_File_Number() {
		return employee_File_Number;
	}
	public void setEmployee_File_Number(String employee_File_Number) {
		this.employee_File_Number = employee_File_Number;
	}
	public String getEmployee_Name() {
		return employee_Name;
	}
	public void setEmployee_Name(String employee_Name) {
		this.employee_Name = employee_Name;
	}
	public String getEmployee_Sex() {
		return employee_Sex;
	}
	public void setEmployee_Sex(String employee_Sex) {
		this.employee_Sex = employee_Sex;
	}
	public String getEmployee_Position() {
		return employee_Position;
	}
	public void setEmployee_Position(String employee_Position) {
		this.employee_Position = employee_Position;
	}
	public String getEmployee_Post() {
		return employee_Post;
	}
	public void setEmployee_Post(String employee_Post) {
		this.employee_Post = employee_Post;
	}
	public String getEmployee_Telphone() {
		return employee_Telphone;
	}
	public void setEmployee_Telphone(String employee_Telphone) {
		this.employee_Telphone = employee_Telphone;
	}
	public String getEmployee_File_States() {
		return employee_File_States;
	}
	public void setEmployee_File_States(String employee_File_States) {
		this.employee_File_States = employee_File_States;
	}
	public String getEmployee_File_Times() {
		return employee_File_Times;
	}
	public void setEmployee_File_Times(String employee_File_Times) {
		this.employee_File_Times = employee_File_Times;
	}
	@Override
	public String toString() {
		return "EmployeeBean [employee_Id=" + employee_Id + ", employee_Department=" + employee_Department
				+ ", employee_File_number=" + employee_File_Number + ", employee_Name=" + employee_Name
				+ ", employee_Sex=" + employee_Sex + ", employee_Position=" + employee_Position + ", employee_Post="
				+ employee_Post + ", employee_Telphont=" + employee_Telphone + ", employee_File_States="
				+ employee_File_States + ", employee_File_Times=" + employee_File_Times + "]";
	}
	
	

}
