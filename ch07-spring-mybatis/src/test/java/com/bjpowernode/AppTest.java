package com.bjpowernode;

import static org.junit.Assert.assertTrue;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testDaoInsert(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        //获取spring容器中的dao对象
        StudentDao dao = (StudentDao) ctx.getBean("studentDao");
        Student student = new Student();
        student.setId(1012);
        student.setName("谢霆锋");
        student.setEmail("slkfjsldkj@qq.com");
        student.setAge(20);
        int nums = dao.insertStudent(student);
        System.out.println("nums:"+nums);
    }
    @Test
    public void testServiceInsert(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        //获取spring容器中的dao对象
        StudentService service = (StudentService) ctx.getBean("studentService");
        Student student = new Student();
        student.setId(1015);
        student.setName("牛爷爷");
        student.setEmail("niuyeyej@qq.com");
        student.setAge(80);
        int nums = service.addStudent(student);
        System.out.println("nums:"+nums);
    }
    @Test
public void testServiceSelect(){
    String config = "applicationContext.xml";
    ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
    //获取spring容器中的dao对象
    StudentService service = (StudentService) ctx.getBean("studentService");
    List<Student> students = service.queryStudents();

}
}
