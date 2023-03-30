package javaIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile2 {

   public static void main(String args[]) throws IOException {
      FileReader in = null;
      FileWriter out = null;

      try {
         in = new FileReader("C:\\Users\\alexh\\TTS\\TTS-February\\week10\\javaIO\\src\\input.txt");
         out = new FileWriter("C:\\Users\\alexh\\TTS\\TTS-February\\week10\\javaIO\\src\\output.txt");
         
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
