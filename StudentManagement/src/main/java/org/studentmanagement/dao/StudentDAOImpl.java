package org.studentmanagement.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.studentmanagement.model.Student;
import org.studentmanagement.utility.StudentRowMapper;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {
    private final StudentRowMapper rowMapper = new StudentRowMapper();
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Student> loadStudents() {
        try {
            String query = "SELECT * FROM students";
            return jdbcTemplate.query(query, rowMapper);
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void saveStudent(Student student) {
        try {
            String query = "INSERT INTO students (studentName, studentMobile, studentCountry) VALUES (?, ?, ?)";
            Object[] objects = {student.getStudentName(), student.getStudentMobile(), student.getStudentCountry()};
            jdbcTemplate.update(query, objects);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Student getStudentById(int id) {
        try {
            String query = "SELECT * FROM students WHERE studentId = ?";
            return jdbcTemplate.queryForObject(query, rowMapper, id);
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void updateStudent(Student student) {
        try {
            String query = "UPDATE students SET studentName = ?, studentMobile = ?, studentCountry = ? WHERE studentId = ?";
            Object[] objects = {student.getStudentName(), student.getStudentMobile(), student.getStudentCountry(), student.getStudentId()};
            jdbcTemplate.update(query, objects);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteStudent(int id) {
        try {
            String query = "DELETE FROM students WHERE studentId = ?";
            jdbcTemplate.update(query, id);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }
}
