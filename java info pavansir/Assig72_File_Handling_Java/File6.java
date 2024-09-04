// Que. 6 Write a program to count number of bytes in a image file(jpeg/png/gif). Also find how
// much time it will take to upload the file on server if internet speed is 256 bps(bitsper
// second).
import java.io.File;
public class File6 {
    public static void main(String[] args) {
       
      try{
        String fname = "E:\\ALL coading\\java info pavansir\\Assig72_File_Handling_Java\\name.png";

        File f = new File(fname);
        long uplodTime = (f.length()*8)/256;
        System.out.println("File size is: "+f.length());
        System.out.println("Total time for Uploading is: "+uplodTime);
        
      } catch (Exception e){
        e.printStackTrace();
      }
    }
}       