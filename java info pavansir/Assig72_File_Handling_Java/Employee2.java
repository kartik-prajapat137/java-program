import java.io.Serializable;
public class Employee2 implements Serializable{
    private String name;
    private int id;
    private int age;
    private String contact;
    private double salary;
    private double alloance;

     Employee2(String name, int id, int age, String contact, double salary, double alloance){
    this. name=name;
    this. id=id;
    this. age=age;
    this. contact=contact;
    this. salary=salary;
    this. alloance=alloance;
    }

    public String toString(){
        return name+" "+id+" "+age+" "+contact+" "+salary+" "+alloance;
    }
}
