package Java_IO_Stream;

import java.io.*;

public class Output_Stream {
   public static void main(String[] args) throws Exception{
	   try {
			FileOutputStream fos = new FileOutputStream("C:/Users/Tanishk kumar/Desktop/MyJava/test.txt");
			String str = "learn java programming";

			fos.write(str.getBytes());
			fos.close(); // closing the output stream
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
}
}
