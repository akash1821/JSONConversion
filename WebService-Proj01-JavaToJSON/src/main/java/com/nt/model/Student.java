package com.nt.model;

import java.util.List;
import java.util.Set;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class Student {
	private Integer sid;
	private String sname; 
	private Double sfee;
	private ExamData edata;
	private Set<String> subs;
	private List<Integer> marks;
}
