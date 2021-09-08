package com.nt.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ExamData {
	private Integer totalMarks;
	private String grade;
	private String result;
}
