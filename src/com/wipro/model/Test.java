package com.wipro.model;

public class Test {

	private String testId;
	private String testTitle;
	private String testMarks;

	public String getTestId() {
		return testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
	}

	public String getTestTitle() {
		return testTitle;
	}

	public void setTestTitle(String testTitle) {
		this.testTitle = testTitle;
	}

	public String getTestMarks() {
		return testMarks;
	}

	public void setTestMarks(String testMarks) {
		this.testMarks = testMarks;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(" testId : ").append(getTestId());
		sb.append("\n testTitle : ").append(getTestTitle());
		sb.append("\n testMarks : ").append(getTestMarks());
		
		return sb.toString();
	}
}
