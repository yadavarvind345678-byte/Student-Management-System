package com.ibm.jdbc_servlet_crud_operation.prepared_statement.controller;

import java.time.LocalDate;

import com.ibm.jdbc_servlet_crud_operation.prepared_statement.Dao.StudentDao;
import com.ibm.jdbc_servlet_crud_operation.prepared_statement.dto.Student;

public class InsertStudentController {

	public static void main(String[] args) {

		StudentDao dao = new StudentDao();
		
		Student student = new Student();
		
	/*	student.setId(107);
		student.setName("binu b");
		student.setEmail("bina23@gmail.com");
		student.setPassword("binaab97");
		student.setPhone(767654321);
		student.setAddress("noida sector 150");
		student.setDob(LocalDate.parse("2006-11-15"));*/
		
		
		 student.setId(109);
		 student.setName("aanad c");
		 student.setEmail("aanada456@gmail.com");
		 student.setPassword("aanadc987");
		 student.setPhone(767654322);
		 student.setAddress("noida sector 76");
		 student.setDob(LocalDate.parse("2005-07-23"));
		 
		
		
		int a=dao.saveStudentDao(student);

		String msg = a!=0?"data saved":"something went wrong check your code";
		
		System.out.println(msg);
	}
}
