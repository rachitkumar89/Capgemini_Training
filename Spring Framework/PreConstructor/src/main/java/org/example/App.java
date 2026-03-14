package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("post_and_pre.xml");
        Vehicle v1=(Vehicle) context.getBean("v_id");
        ((AbstractApplicationContext) context).close();
    }
}
