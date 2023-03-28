import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanUsingAnnotations {

    String name;

    @Override
    public String toString() {
        return "BeanUsingAnnotations{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @PostConstruct
    public void init()
    {
        System.out.println("init called using annotations");
    }

    @PreDestroy
    public void destroy()
    {
        System.out.println("destroy called using annotations");
    }
}
