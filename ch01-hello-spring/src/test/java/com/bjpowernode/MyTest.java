package com.bjpowernode;
import com.bjpowernode.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void Test02(){
        //使用spring容器创建的对象
        //1.指定spring配置文件的名称
        String config="beans.xml";
        //2.创建表示spring容器的对象,ApplicationContext
        //ApplicationContext就是表示Spring容易,通过容器获取对象了
        //ClassPathXmlApplicationContext:表示从类路径中加载spring的配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获取某个对象,你要调用对象的方法
        //getBean("配置文件中的bean的id值")
        SomeService service = (SomeService)ac.getBean("someService");
        //使用spring创建好的对象
        service.doSome();
    }
    @Test
    public void Test03(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //SomeService someService1 = (SomeService)ac.getBean("someService1");
    }
}
