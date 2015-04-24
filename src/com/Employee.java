package com;

import java.io.Serializable;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Employee implements Serializable {
    private int empid;
    private String name;
    private float salary;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
    private long mobile;
    private String emailid;
    
   //  HibernateUtil helper;
    
    
    public static void main(String ss[])
    {
    	Session session;
       Configuration cfg = new Configuration();
   cfg.configure("hibernate.cfg.xml");
        @SuppressWarnings("deprecation")
		SessionFactory sf= cfg.buildSessionFactory();
        
       session = sf.openSession();
        session.beginTransaction();
       Employee emp = new Employee();
       emp.setEmpid(8);
      emp.setName("avc");
       emp.setMobile(89014363);
       emp.setEmailid("jj@gmail.com");
        emp.setSalary(2000);
        session.save(emp);
        session.getTransaction().commit();
        session.close();
        
    }
}

    

