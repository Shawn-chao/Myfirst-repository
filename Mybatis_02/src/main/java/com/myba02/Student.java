package com.myba02;

public class Student {
    private Integer id;
    private String na;
    private String dept;
    private double tot;
    private long birth;

    public Student() {
    }

//    public Student(Integer ID, String name, String dept_name, double tot_cred, long birthday) {
//        this.id = ID;
//        this.na = name;
//        this.dept = dept_name;
//        this.tot = tot_cred;
//        this.birth = birthday;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + id +
                ", name='" + na + '\'' +
                ", dept_name='" + dept + '\'' +
                ", tot_cred=" + tot +
                ", birthday=" + birth +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNa() {
        return na;
    }

    public void setNa(String na) {
        this.na = na;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getTot() {
        return tot;
    }

    public void setTot(double tot) {
        this.tot = tot;
    }

    public long getBirth() {
        return birth;
    }

    public void setBirth(long birth) {
        this.birth = birth;
    }

    public void show(){
        System.out.println("学生编号："+id+" 学生姓名："+na+" 学生专业："+dept+" 学生学分："+tot+" 学生生日："+birth);
    }

}
