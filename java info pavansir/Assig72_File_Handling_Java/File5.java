// Que. 5 Write a program to count no of words in a text file and average word size.

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class File5 {
    public static void main(String[] args) {
       try { 
        String str = "aman has a bol that is called boll ";
        File f = new File("average.txt");
        FileOutputStream fout = new FileOutputStream(f);
        byte[] b = str.getBytes();
        fout.write(b);

        FileInputStream fin = new FileInputStream(f);
        
        int i,j=0,total=0;
        int min=100;
        while((i=fin.read())!=-1){
            if(i!=32)
            j++;
            if(i==32){
                total++;
                if(j<min){
                    min=j;
                }
                j=0;
            }
        }
        System.out.println("Average Value of file is "+min+" And Toal Word is "+total);

    } catch(Exception e) {
        e.printStackTrace();
    }
    }
}
