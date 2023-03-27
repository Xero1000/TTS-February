package javaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamExample {

   public static void main(String args[]) throws IOException {  
      FileInputStream in = null;
      FileOutputStream out = null;

      try {
         in = new FileInputStream("C:\\Users\\alexh\\TTS\\TTS-February\\week10\\javaIO\\src\\input.txt");
         out = new FileOutputStream("C:\\Users\\alexh\\TTS\\TTS-February\\week10\\javaIO\\src\\output.txt");
         
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
