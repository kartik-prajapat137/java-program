import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Read3 {
    public static void main(String[] args) {
       try {
         File f = new File("Studen.txt");
        FileInputStream fin = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fin);
        Student3 c =(Student3)ois.readObject();
        System.out.println(c);
       } catch (Exception e){
        e.printStackTrace();
       }
    }
}
