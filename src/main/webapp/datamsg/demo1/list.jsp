<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
	+ request.getServerName() + ":" + request.getServerPort()
	+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
    <head>
    <base href="<%=basePath%>">
        <meta http-equiv="content-type" content="text/html; charset=UTF-8" />

        <title>数据分析</title>

        <link href="css/mine.css" type="text/css" rel="stylesheet" />
    </head>
    <body>
        <style>
            .tr_color{background-color: #9F88FF}
        </style>
        <div class="div_head">
            <span>
                <span style="float: left;">当前位置是：数据分析 ---》职员明细表</span>
                <span style="float: right; margin-right: 8px; font-weight: bold;">
                   
                </span>
            </span>
        </div>
        <div></div>
        <div class="div_search">
            <span>
                <form action="employee/employeequery.do" method="post">
                   部门: 
				   <select id=dep  >
						<option value = 0 >
							--请选择---
						</option>
						<c:forEach items="${department }" var="dep">
						<option value="${dep }">
							${dep }
						</option>
						</c:forEach>
				   </select>
				   员工姓名：
					<input type="text" id=em_name  />
					档案状态：
					<select id=file_state>
						<option>
							--请选择---
						</option>
						<option value="1">
							试用期
						</option>
						<option value="2">
							正式员工
						</option>
						<option value="3">
							离职
						</option>
						<option value="4">
							已删除
						</option>
						
				   </select>
					 建档时间: 
					<input type="text" id = timestart  />至
					<input type="text" id = timeover  />
                    <input value="查询" type="submit" />
					
                </form>
            </span>
        </div>
        <div style="font-size: 13px; margin: 10px 5px;">
            <table class="table_a" border="1" width="100%">
                <tbody>
                <tr style="font-weight: bold;">
                        <td width="110px;">部门</td>
                        <td width="140px;">档案编号</td>						
                        <td width="80px;">员工姓名</td>
                        <td width="80px;">性别</td>
						<td width="100px;">职位</td>
                        <td width="120px;">职称</td> 
						<td width="100px;">电话</td>
                        <td width="120px;">档案状态</td>
						<td width="120px;">建档日期</td>
                    </tr>
                <c:forEach items="${employees }" var="employe">
                <tr style="font-weight: bold;">
                        <td width="110px;">${employe.employee_Department }</td>
                        <td width="140px;">${employe.employee_File_Number }</td>						
                        <td width="80px;">${employe.employee_Name }</td>
                        <td width="80px;">${employe.employee_Sex }</td>
						<td width="100px;">${employe.employee_Position }</td>
                        <td width="120px;">${employe.employee_Post }</td> 
						<td width="100px;">${employe.employee_Telphone }</td>
                        <td width="120px;">
                        <c:if test="${employe.employee_File_States == 1 }" >
                        试用期 </c:if>
                        <c:if test="${employe.employee_File_States == 2 }" >
              正式员工          </c:if>
              <c:if test="${employe.employee_File_States == 3 }" >
             已离职          </c:if>
              <c:if test="${employe.employee_File_States == 4 }" >
              已删除          </c:if>
                        
                        
                        </td>
						<td width="120px;">${employe.employee_File_Times }</td>
                    </tr>
                </c:forEach>

                   
					
                    <tr>
                        <td colspan="20" style="text-align: center;">						
						<a style="text-decoration: none;" href="#">
                            首页 </a>上一页  ... 7 8 9 10 11 12 ... 下一页 尾页 共1234条 每页显示 10/23 
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </body>
</html>