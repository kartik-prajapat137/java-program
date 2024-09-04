import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class handaling2 {
    public static void main(String[] args) {
        String filename ="exampletwo.csv";
        File file = new File(filename);
         
        if (file.exists()) {
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist.");
        }

        try {if(file.createNewFile()){
            System.out.println("new file created : ");
        } else {
            System.out.println("File alredy exist : ");
        }
    } catch (IOException e) {
        System.out.println(e);  
    }

    try(PrintWriter writers = new PrintWriter(file)){
            writers.println("Name , age");
            writers.println("kartik , 18");

    } catch (IOException e){
        System.out.println(e);
    }



    }
}
