package com.nt.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.model.ExamData;
import com.nt.model.Student;

public class JSONTest01 {

	public static void main(String[] args) {
		int sum=0;
		
		List<Integer> al = new ArrayList<Integer>();
		al.add(89);
		al.add(85);
		al.add(76);
		
		Set<String> hs = new HashSet<String>();
		hs.add("PHY");
		hs.add("CHE");
		hs.add("MATH");
		
		ExamData edata=new ExamData();
		for(int i=0;i<al.size();i++) {
			sum=sum+al.get(i);
		}
		edata.setTotalMarks(sum);
		edata.setResult(edata.getTotalMarks()>35?"Pass":"Fail");
		
		edata.setGrade(edata.getTotalMarks()>80?"A":"B");
		
		Student st = new Student();
		st.setSid(101);
		st.setSname("Akash");
		st.setSfee(2500.00);
		st.setSubs(hs);
		st.setEdata(edata);
		st.setMarks(al);
		
		//create ObjcetMapper object
		ObjectMapper objMap = new ObjectMapper();
		try {
		//convert st object to json
		String json = objMap.writeValueAsString(st);
		
		//print json object
		System.out.println(json);  //{"sid":101,"sname":"Akash","sfee":2500.0,"edata":{"totalMarks":250,"grade":"A","result":"Pass"},"subs":["PHY","CHE","MATH"],"marks":[89,85,76]}
		
		System.out.println("===============================");
		//convert json to emp object
		Student stu = objMap.readValue(json, Student.class);
		
		System.out.println(stu);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
