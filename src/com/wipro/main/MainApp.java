package com.wipro.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.model.Student;
import com.wipro.model.Test;



public class MainApp {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationAppConfig.class);
		
		List<Test> testList = new ArrayList<Test>();
		
		
		Student student1 = context.getBean("student", Student.class);
		Student student2 = context.getBean("student", Student.class);
		
		Test test1 = context.getBean("test", Test.class);
		Test test2 = context.getBean("test", Test.class);
		
		testList.add(test1);
		
		//First Student
		student1.setStudentId("1");
		student1.setStudentName("Raja");
		student1.setStudentTest(testList);
		
		//Test Details
		test1.setTestId("101");
		test1.setTestMarks("95");
		test1.setTestTitle("Java L1");
		
		//Test Details
		test2.setTestId("102");
		test2.setTestMarks("100");
		test2.setTestTitle("Java L2");
		
		//Second Student
		
		testList = new ArrayList<Test>();
		testList.add(test1);
		testList.add(test2);
		
		student2.setStudentId("2");
		student2.setStudentName("Ram");
		student2.setStudentTest(testList);
		
		
		System.out.println("\n Student 1 details \n");
		System.out.println(student1);
		
		
		System.out.println("\n Student 2 details \n");
		System.out.println(student2);
		
		
	}
}
