import java.util.List;

public class Person {
    private String name;
    private int id;
    private Certi c;
    private List<String> list;



    public Person(String name, int id,Certi c,List<String>list) {
        this.name = name;
        this.id = id;
        this.c=c;
        this.list= list;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", c=" + c +
                ", list=" + list +
                '}';
    }
}
