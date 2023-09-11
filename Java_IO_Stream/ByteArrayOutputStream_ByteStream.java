package Java_IO_Stream;

import java.io.*;

public class ByteArrayOutputStream_ByteStream {
	public static void main(String[] args) throws Exception {
		ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
		bos.write('a');
		bos.write('b');
		bos.write('c');
		bos.write('d');
		byte b[] = bos.toByteArray();
		for (byte a : b) {
			System.out.println((char)a);
		}
		
		//we can also write this yte array to some file
		   //bos.writeTo(new FileOutputStream("C:/Users/Tanishk kumar/Desktop/MyJava/byteout.txt"));
		bos.close();
	}
}
