package dependency_injection_usingMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("map_kit.xml");
        Kit kit=applicationContext.getBean(Kit.class);
        System.out.println(kit);
    }
}
