package org.studentmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.studentmanagement.dao.StudentDAO;
import org.studentmanagement.model.Student;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDAO studentDAO;

    @Override
    public List<Student> loadStudents() {
        try {
            return studentDAO.loadStudents();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void saveStudent(Student student) {
        try {
            studentDAO.saveStudent(student);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Student getStudentById(int id) {
        try {
            return studentDAO.getStudentById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void updateStudent(Student student) {
        try {
            studentDAO.updateStudent(student);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteStudent(int id) {
        try {
            studentDAO.deleteStudent(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
