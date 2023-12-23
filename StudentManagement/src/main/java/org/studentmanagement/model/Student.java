package org.studentmanagement.model;

public class Student {
    private int studentId;
    private String studentName;
    private String studentMobile;
    private String studentCountry;

    public Student() {
    }

    public Student(String studentName, String studentMobile, String studentCountry) {
        this.studentName = studentName;
        this.studentMobile = studentMobile;
        this.studentCountry = studentCountry;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentMobile() {
        return studentMobile;
    }

    public void setStudentMobile(String studentMobile) {
        this.studentMobile = studentMobile;
    }

    public String getStudentCountry() {
        return studentCountry;
    }

    public void setStudentCountry(String studentCountry) {
        this.studentCountry = studentCountry;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", studentName='" + studentName + '\'' + ", studentMobile='" + studentMobile + '\'' + ", studentCountry='" + studentCountry + '\'' + '}';
    }
}
