import java.io.Serializable;
public class customer2 implements Serializable {
    private int id;
    private String name;
    private int age;
    private String contact;

    public customer2(int id, String name, int age, String contact){
        this.id=id;
        this.name=name;
        this.contact=contact;
        this.age=age;
    }
    public String toString(){
        return id+" "+name+" "+contact+" "+age;
    }
}
