import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;


public class File2_Write {
    public static void main(String args[]){

        try {
        File f = new File("cmt.txt");
        FileOutputStream fout = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        customer2 c = new customer2(101,"kartik",20,"9999666626");
        oos.writeObject(c);
        System.out.println("DAta Successfully Write in File");
        
        FileInputStream fin = new FileInputStream("cmt.txt");
        ObjectInputStream ois = new ObjectInputStream(fin);
        System.out.println(ois.readObject());
      } catch(Exception e) {
        e.printStackTrace();
      }
    }
}
