import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class File4 {
    public static void main(String[] args) {
        String str = "ttt TTTkhku";
        //1
        try{
        File f = new File("mayurii.txt");
        
        FileOutputStream fout = new FileOutputStream(f);
        byte[] b = str.getBytes();
        fout.write(b);
        System.out.println("Succesfully Write Data : ");
       
    
        //2
        try {

            int temp=0;
            FileInputStream fin = new FileInputStream(f);
            int i,cout=0;
            while((i=fin.read()) != -1){
                temp++;
                if((char)i=='T'||i==116){
                System.out.print((char)i+" ");  
                cout++;
                }
            }
            System.out.println("count : "+cout+"Total length of word "+temp);
            
           } catch (Exception e){
               e.printStackTrace();
           }
        } catch (Exception e){
            e.printStackTrace();     
        }      
        
        
    }
}
