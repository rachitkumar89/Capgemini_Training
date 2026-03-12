package dependencyInje;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("list_dependency.xml");
//        Library library = applicationContext.getBean(Library.class);
//        System.out.println(library);

        Library1 library1 = applicationContext.getBean(Library1.class);
        System.out.println(library1);

    }
}