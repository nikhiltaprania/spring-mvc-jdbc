package org.studentmanagement.utility;

import org.springframework.jdbc.core.RowMapper;
import org.studentmanagement.model.Student;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setStudentId(rs.getInt("studentId"));
        student.setStudentName(rs.getString("studentName"));
        student.setStudentMobile(rs.getString("studentMobile"));
        student.setStudentCountry(rs.getString("studentCountry"));
        return student;
    }
}