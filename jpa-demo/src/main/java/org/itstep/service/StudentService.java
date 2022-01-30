package org.itstep.service;

import org.itstep.entity.Student;

import java.util.List;

public interface StudentService {
    Integer save(Student student);

    List<Student> findAll();

    Student findById(Integer id);
}
