package com.ibm.jdbc_servlet_crud_operation.prepared_statement.controller;

import java.util.List;

import com.ibm.jdbc_servlet_crud_operation.prepared_statement.Dao.StudentDao;
import com.ibm.jdbc_servlet_crud_operation.prepared_statement.dto.Student;

public class DisplayAllStudentController {

	public static void main(String[] args) {
		
		List<Student> students=new StudentDao().getAllStudentDao();
		
		students.forEach(student->System.out.println(student));
		
		//boolean b=new StudentDao().deleteStudentByIdDao(7890);
		
		//String msg = b?"deleted":"something went wrong";
		
		//System.out.println(msg);
	}
}
