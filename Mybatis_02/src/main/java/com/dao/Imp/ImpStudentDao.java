package com.dao.Imp;

import com.dao.StudentDao;
import com.myba02.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class ImpStudentDao  {
/*可以不用写StudentDao的实现类*/
//    private StudentDao studentDao;
//    private SqlSessionFactory factory;
//    private Reader in;
//    private SqlSession session;
//
//
//    public void init() {
//        try {
//            in = Resources.getResourceAsReader("Mybatis_config.xml");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        factory = new SqlSessionFactoryBuilder().build(in);
//        session = factory.openSession();
////            list=session.selectList("com.dao.StudentDao.findallStudends");
//        studentDao = session.getMapper(StudentDao.class);
//    }
//
//    public List<Student> findallStudends() {
//        List<Student> list = new ArrayList<Student>();
//        list = studentDao.findallStudends();
//        return list;
//    }
//
//    public List<Student> findStudends(String name) {
//        List<Student> list = new ArrayList<Student>();
//        list = studentDao.findStudends(name);
//        return list;
//    }
}
