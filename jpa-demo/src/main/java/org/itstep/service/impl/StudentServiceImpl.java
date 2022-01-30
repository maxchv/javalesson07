package org.itstep.service.impl;

import org.itstep.entity.Student;
import org.itstep.service.StudentService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    private final EntityManager entityManager;

    public StudentServiceImpl() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("student");
        entityManager = emf.createEntityManager();
    }

    @Override
    public Integer save(Student student) {
        Integer id = 0;
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(student);
            id = student.getId();
            entityManager.getTransaction().commit();
        } catch (Throwable ex) {
            entityManager.getTransaction().rollback();
        }
        return id;
    }

    @Override
    public List<Student> findAll() {
        List<Student> students = null;
        try {
            entityManager.getTransaction().begin();
            // select * from Student
            students = entityManager.createQuery("from Student", Student.class).getResultList();
            entityManager.getTransaction().commit();
        } catch (Throwable ex) {
            entityManager.getTransaction().rollback();
        }
        return students;
    }

    @Override
    public Student findById(Integer id) {
        Student student = null;
        try {
            entityManager.getTransaction().begin();
            student = entityManager.find(Student.class, id);
            entityManager.getTransaction().commit();
        } catch (Throwable ex) {
            entityManager.getTransaction().rollback();
        }
        return student;
    }
}
