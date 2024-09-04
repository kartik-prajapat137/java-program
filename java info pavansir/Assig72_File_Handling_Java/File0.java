// Que. 1 Write a java program to read/write data into the file.(Use File Output Stream, File Input
// Stream).
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class File0 {
    public static void main(String args[]){
        File f = new File("kt.txt");

        String str ="hdwcnknwe kewbndj ";
        try(FileOutputStream writer = new FileOutputStream(f)) {
            byte b[] = str.getBytes();
            writer.write(b);
            System.out.println("Writed Succesfully");
        } catch (IOException e2){
            System.out.println(e2);
        }

        try(FileInputStream fin = new FileInputStream(f)){
            int i;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
        } catch (IOException e){
            System.out.println(e);
        }
    }
}
