package org.studentmanagement.dao;

import org.studentmanagement.model.Student;

import java.util.List;

public interface StudentDAO {
    List<Student> loadStudents();

    void saveStudent(Student student);

    Student getStudentById(int id);

    void updateStudent(Student student);

    void deleteStudent(int id);
}