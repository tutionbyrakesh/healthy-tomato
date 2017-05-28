package com.bytestree.restful.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bytestree.restful.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
