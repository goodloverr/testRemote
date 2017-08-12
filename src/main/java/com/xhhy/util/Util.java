package com.xhhy.util;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Util {
public List<Integer> pagelist(int pagenow , int pageover){
	List<Integer> pagelist = new ArrayList<Integer>();
	pagelist.add(pagenow);
	pagelist.add(pageover);
	return pagelist;
}

public Map employeequerylist(String dep,String em_name,String file_state,String timestart,String timeover){
	Map querylist = new HashMap();
	querylist.put("dep", dep);
	querylist.put("em_name", em_name);
	querylist.put("file_state",file_state );
	querylist.put("timestart",timestart );
	querylist.put("timeover",timeover );
	return querylist;
}
	
	
}
