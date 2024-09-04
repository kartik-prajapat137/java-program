import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Write3  {
    public static void main(String[] args) {
        try {
        File f = new File("Studen.txt");
        FileOutputStream fout =new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        Student3 std = new Student3(101, "kartik", "6666787764","Indore");
        oos.writeObject(std);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
