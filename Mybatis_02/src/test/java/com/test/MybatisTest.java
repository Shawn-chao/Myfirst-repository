package com.test;

import com.dao.Imp.ImpStudentDao;
import com.dao.StudentDao;
import com.myba02.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MybatisTest {
    private StudentDao studentDao;
    private SqlSessionFactory factory;
    private Reader in;
    private SqlSession session;


    public void init() {
        try {
            in = Resources.getResourceAsReader("Mybatis_config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        factory = new SqlSessionFactoryBuilder().build(in);
        session = factory.openSession();
//            list=session.selectList("com.dao.StudentDao.findallStudends");
        studentDao = session.getMapper(StudentDao.class);

    }

    public List<Student> findallStudends() {
        List<Student> list = new ArrayList<Student>();
        list = studentDao.findallStudends();
        return list;

    }

    public Student findstudentByid(int sid){
        Student student=new Student();
        student=studentDao.findstudentByid(sid);
        return student;
    }

    public List<Student> findStudendsByname(String na) {
        List<Student> list = new ArrayList<>();
        list = studentDao.findStudendsByname(na);
        return list;
    }

    public void insertstudent(Student student){
        studentDao.insertstudent(student);
        System.out.println("添加成功！");
        session.commit();
        session.close();
    }

    public void deletestudentByid(int id){
        studentDao.deletestudentByid(id);
        System.out.println("删除成功！");
        session.commit();
    }

    public void deletestudentByname(String na){
        studentDao.deletestudentByname(na);
        System.out.println("删除成功！");
        session.commit();
    }

    public void updatestudent(Student s){
        studentDao.updatestudent(s);
        System.out.println("更新完成！");
        session.commit();
    }

    public void findStudentbyChar(char ch){
        List<Student> list=new ArrayList<>();
        list=studentDao.findStudentbyChar(ch);
        for(Student s2:list){
            s2.show();
        }
    }

    public void findStudentByDept(char ch){
        List<Student> list=new ArrayList<>();
        list=studentDao.findStudentByDept(ch);
        for (Student s3: list) {
            s3.show();
        }
    }

    public void findStudentsif(Student student){
        List<Student> list=new ArrayList<>();
        list=studentDao.findStudentsif(student);
        for (Student s4:list){
            s4.show();
        }
    }

    public void findStudentsMap(Map map){
        List<Student> list=new ArrayList<>();
        list=studentDao.findStudentsMap(map);
        for (Student s5:list){
            s5.show();
        }
    }

    public static <Char> void main(String[] args) {
        MybatisTest my=new MybatisTest();
        my.init();
//        Student student=new Student(23321,"giao哥","Comp. Sci.",46,1998);
//        my.insertstudent(student);

//        Student student=my.findstudentByid(12345);
//        student.show();
//        my.deletestudentByid(128);
//        my.deletestudentByname("giao哥");
//        Student student1=new Student(98988,"giao哥","Comp. Sci.",46,1998);
//        my.updatestudent(student1);
        List<Student> list=my.findallStudends();
        for (Student s:list){
            System.out.println(s);
        }
//        List<List<Integer>> pairs= {{0, 3},{1, 2},{0, 2}};
//        List<Integer> l;

//        my.findStudentbyChar('s');
//        my.findStudentByDept('y');
//        Student student=new Student();
//        student.setNa("e");
//        student.setTot(56);
//        student.setDept("c");
//        my.findStudentsif(student);
//       Map<String,Object> map=new HashMap<String,Object>();
//       map.put("na","a");
//       map.put("totStart",50);
//       map.put("totEnd",90);
//       map.put("dept","c");
//       my.findStudentsMap(map);
//        List<Student> list2=my.findStudendsByname("giao哥");
//        for (Student s:list2) {
//            System.out.println(s);
//        }
    }
}
