package Java_IO_Stream;

import java.io.*;

//creating byte array
public class Byte_Streams_CharArrayReaderPart2 {
	public static void main(String[] args) throws Exception {
		ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
		bos.write('b');
		bos.write('a');
		bos.write('c');
		bos.write('d');

//		byte[] arr = bos.toByteArray();  //to write in a array of bytes
//		for (byte x : arr) {
//			System.out.print((char) x + " ");
//		}
		bos.writeTo(new FileOutputStream("C:/Users/Tanishk kumar/Desktop/MyJava/c3.txt")); // to write in a file
		bos.close();
	}
}
