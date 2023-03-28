import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
       /* Person obj=(Person) context.getBean("person");
        System.out.println(obj);
        Addition add=(Addition)  context.getBean("add");
        add.sum();
        Message m1=(Message) context.getBean("msg");

        System.out.println(m1);
          //registring shutdownhook



        BeanUsingInterfaces b1=(BeanUsingInterfaces) context.getBean("interface");
        System.out.println(b1);
        context.registerShutdownHook();
        BeanUsingAnnotations a1=(BeanUsingAnnotations) context.getBean("anno");
        System.out.println(a1);*/
     // Address address1=(Address) context.getBean("address") ;
       // System.out.println(address1);
        Employee emp1=(Employee) context.getBean("emp");
       System.out.println(emp1);



    }
}
