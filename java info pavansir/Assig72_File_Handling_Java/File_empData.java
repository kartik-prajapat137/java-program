import java.io.*;
public class File_empData {
    public static void main(String[] args) {
        File f = new File("empData.csv");

        try{
        if(f.exists()){
            System.out.println("File SuceFully Created :");
        }else{  
            System.out.println("File Already Created :");
        }

        FileOutputStream fout = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        Employee2 emp = new Employee2("kartik", 101,28,"9999222298",40000,12500);
        oos.writeObject(emp);

    }catch(IOException e){
        e.printStackTrace();
    }
    }
}
