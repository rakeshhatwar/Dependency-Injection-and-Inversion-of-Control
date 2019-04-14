package com.wipro.model;

import java.util.List;

public class Student {

	private String studentId;
	private String studentName;
	private List<Test> studentTest;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<Test> getStudentTest() {
		return studentTest;
	}

	public void setStudentTest(List<Test> studentTest) {
		this.studentTest = studentTest;
	}

	public void getStudentDetails() {

		System.out.println("Student [studentId=" + studentId + ", studentName=" + studentName + ", studentTest="
				+ studentTest + "]");
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append(" studentId : ").append(getStudentId());
		sb.append("\n studentName : ").append(getStudentName());
		sb.append("\n studentTest : [");

		getStudentTest().forEach((testDetails) -> {

			sb.append("\n Test ID: ").append(testDetails.getTestId());
			sb.append(" Test Title: ").append(testDetails.getTestTitle());
			sb.append(" Test Marks: ").append(testDetails.getTestMarks());

		});

		sb.append("]");

		return sb.toString();
	}

}
