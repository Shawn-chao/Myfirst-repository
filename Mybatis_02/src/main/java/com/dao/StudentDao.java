package com.dao;

import com.myba02.Student;

import java.util.List;
import java.util.Map;

public interface StudentDao {
    public List<Student> findallStudends();

    void init();

    List<Student> findStudendsByname(String name);

    Student findstudentByid(int id);

    void insertstudent(Student student);

    void deletestudentByid(int id);

    void deletestudentByname(String na);

    void updatestudent(Student student);

    List<Student> findStudentbyChar(char ch);

    List<Student> findStudentByDept(char ch);

    List<Student> findStudentsif(Student student);

    List<Student> findStudentsMap(Map map);
}
