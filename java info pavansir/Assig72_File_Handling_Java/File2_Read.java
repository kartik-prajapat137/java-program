import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class File2_Read {
    public static void main(String args[]){
       try {
         File f = new File("cmt.txt");
        FileInputStream fin = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fin);
        customer2 l =(customer2)ois.readObject();
        System.out.println(l);

       }
        catch (Exception e){
        e.printStackTrace();
       }
    }    
}
