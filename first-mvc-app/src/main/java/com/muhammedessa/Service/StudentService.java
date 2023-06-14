package com.muhammedessa.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.muhammedessa.models.Student;

@Service

public class StudentService {
	
	private static int studentNumber = 4;
	private static List<Student> students = new ArrayList<Student>();
	
	static {
		students.add(new Student(1,"Ahmed Emad" , "22-5-2000" , true));
		students.add(new Student(2,"Muhamed Hassan" , "22-5-2003" , true));
		students.add(new Student(3,"Mohsen Mosa" , "7-4-2005" , true));
		students.add(new Student(4,"Mostafe Ragaie" , "2-3-2004" , true));
		
	}
	
	
	
	
	public List<Student> readAllStudent (){
		List<Student> student = new ArrayList<Student>();
		for(Student st : students) {
			
				student.add(st);
			
		}
		return student ;
	}
	
	
	
	
	
	
	public void addStudent ( String name, String date, boolean isActive) {
		students.add(new Student(++studentNumber, name , date , isActive));
	}
	
	
	
	
	
	
	
	
	
	
	public void deleteStudent(int id) {
		Iterator<Student> iterator = students.iterator();
		
		while (iterator.hasNext()) {
			Student student = iterator.next();
			if(student.getId() == id ) {
				iterator.remove();
			}
		}
		
	}
	
	
	
	public Student getinfo( int id) {
		for(Student student : students) {
			if(student.getId() == id) {
				return student;
			}
		}
		
		return null;
		
	}
	
	public void update( int id , String name , String date , boolean isActive) {
		Iterator<Student> iterator =  students.iterator();
		
		while (iterator.hasNext()) {
			Student student = iterator.next();
			if(student.getId() == id ) {
				student.setName(name);
				student.setDate(date);
				
				
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
