package Java_IO_Stream;

import java.io.*;

public class file_INPUT_STREAM {

	public static void main(String[] args) throws Exception {
		try {
			FileInputStream fis = new FileInputStream("C:/Users/Tanishk kumar/Desktop/MyJava/test.txt");
			byte b[] = new byte[fis.available()];
			fis.read(b);
			String arr = new String(b);
			System.out.println(arr);

			
			// to read data byte by byte we can also write
//			  int x;
//			  do{
//			  x=fis.read();
//			  if(x!=-1)
//			  			System.out.print((char)x);
//			  }while(x!=-1);
			 
		} finally {

		}
	}

}
