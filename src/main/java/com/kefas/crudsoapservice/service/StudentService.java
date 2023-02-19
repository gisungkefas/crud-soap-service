package com.kefas.crudsoapservice.service;

import com.kefas.crudsoapservice.dto.StudentDto;
import com.kefas.crudsoapservice.entities.Student;

import java.util.List;

public interface StudentService {

    StudentDto createStudent(StudentDto studentDto);

    StudentDto editStudent(StudentDto studentDto, Long studentId);

    String deleteStudent(Long studentId);

    Student getStudentById(Long studentId);

    List<Student> getAllStudent();
}
