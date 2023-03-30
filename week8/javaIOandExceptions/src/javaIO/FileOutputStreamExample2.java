package javaIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample2 {

   public static void main(String args[]) throws IOException {  
      FileInputStream in = null;
      FileOutputStream out = null;
      
      File i = new File("C:\\Users\\alexh\\TTS\\TTS-February\\week10\\javaIO\\src\\input.txt");
      File o = new File("C:\\Users\\alexh\\TTS\\TTS-February\\week10\\javaIO\\src\\output.txt");

      try {
         in = new FileInputStream(i);
         out = new FileOutputStream(o);
         
         System.out.println(in.available());
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}
