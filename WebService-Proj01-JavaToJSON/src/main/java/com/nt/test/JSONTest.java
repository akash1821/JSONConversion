package com.nt.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.model.Address;
import com.nt.model.Employee;

public class JSONTest {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<>();
		l.add("P1");
		l.add("P2");
		l.add("P3");
		
		Set<String> s = new HashSet<>();
		s.add("V1");
		s.add("V2");
		s.add("V3");
		
		Map<String, Integer> map=new HashMap<>();
		map.put("V1", 12);
		map.put("V2", 16);
		map.put("V3", 18);
		
		Address addrs = new Address();
		addrs.setHno(1404);
		addrs.setHloc("Mumbai");
		
		//create Model class object
		Employee emp = new Employee();
		emp.setEid(101);
		emp.setEname("Akash");
		emp.setEsal(25000.00);
		emp.setEprjs(l);
		emp.setEmdls(s);
		emp.setEprjs(l);
		emp.setPrjver(map);
		emp.setAddrs(addrs);
		
		//create object of ObjectMapper
		ObjectMapper objMap = new ObjectMapper();
		
		try {
		//convert Emp(Java Object) to JSON format
		String json=objMap.writeValueAsString(emp);
		
		//print json 
		System.out.println(json);	//{"eid":101,"ename":"Akash","esal":25000.0}
		
		//read values from json to employee object
		Employee emp1 = objMap.readValue(json,Employee.class);
		
		//print emp1 object
		System.out.println(emp1);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
