import java.io.BufferedReader;
import java.io.FileReader;

public class name_pass {
    public static void main(String[] args) {
        String filename = "check.csv";

        try(FileReader rider = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(rider)
        ){
            String line;
            while ((line = bufferedReader.readline()) != null) {
                System.out.println(line);
            }
        }
    }
}
