package com.bytestree.restful.controller;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bytestree.restful.model.Student;
import com.bytestree.restful.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	final static Logger logger = Logger.getLogger(StudentController.class);
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		studentService.save(student);
		logger.debug("Added:: " + student);
		return new ResponseEntity<Student>(student, HttpStatus.CREATED);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<Void> updateStudent(@RequestBody Student student){
		Student existingStudent = studentService.getById(student.getRollNumber());
		if(existingStudent == null){
			logger.debug("Student with roll number " + student.getRollNumber()+ " does not exists");
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}else{
			studentService.save(student);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
	
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public ResponseEntity<Student> getStudentByID(@PathVariable("id") Long id){
		Student student = studentService.getById(id);
		if(student == null){
			logger.debug("Student will roll number"+ id +" didn't found");
			return new ResponseEntity<Student> (HttpStatus.NOT_FOUND);
		}else{
			logger.debug("Found : "+student);
			return new ResponseEntity<Student> (student,HttpStatus.OK);
		}
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Student>> getAllStudents(){
		
		List<Student> students = studentService.getAll();
		if(students.isEmpty()){
			logger.debug("No Student Exist");
			return new ResponseEntity<List<Student>>(HttpStatus.NO_CONTENT);
		}else{
			logger.debug("Found "+students.size() +" number of Students");
			logger.debug(Arrays.toString(students.toArray()));
			return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
		}
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public ResponseEntity<Student> deleteStudent(@PathVariable("id") Long id){
		Student student = studentService.getById(id);
		if(student == null){
			logger.debug("Student will roll number"+ id +" doesn't exist");
			return new ResponseEntity<Student> (HttpStatus.NOT_FOUND);
		}else{
			studentService.delete(id);
			logger.debug("Student ID : "+ student.getRollNumber() + " deleted.");
			return new ResponseEntity<Student> (HttpStatus.GONE);
		}
		
	}
}
