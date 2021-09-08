package com.nt.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Employee {
		private Integer eid;
		private String ename;
		private Double esal;
		private Address addrs;
		private List<String> eprjs;
		private Set<String> emdls;
		private Map<String,Integer> prjver;
}
