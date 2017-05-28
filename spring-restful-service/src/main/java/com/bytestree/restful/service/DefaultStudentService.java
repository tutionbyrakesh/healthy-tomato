package com.bytestree.restful.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bytestree.restful.model.Student;
import com.bytestree.restful.repository.StudentRepository;

@Service
public class DefaultStudentService implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student save(Student entity) {
		return studentRepository.save(entity);
	}

	@Override
	public Student getById(Serializable id) {
		return studentRepository.findOne((Long) id);
	}

	@Override
	public List<Student> getAll() {
		return studentRepository.findAll();
	}

	@Override
	public void delete(Serializable id) {
		studentRepository.delete((Long)id);

	}

}
