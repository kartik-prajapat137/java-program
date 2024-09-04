// Que. 3 Explain transient keyword in java with example.
import java.io.Serializable;
public class Student3 implements Serializable{
    private int id; 
    private String name; 
    private String no;
    transient private String location;

    public Student3(int id, String name, String no, String location){
        this.id=id;
        this.name=name;
        this.no=no;
        this.location=location;
    }
    public String toString(){
        return id+" "+name+" "+no+" "+location;
    }
}
