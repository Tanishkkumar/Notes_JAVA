package Java_IO_Stream;

import java.io.*;

public class FileReader_BufferReader {
	public static void main(String[] args) throws Exception {
		FileReader fis = new FileReader("C:/Users/Tanishk kumar/Desktop/MyJava/byteout.txt");
		BufferedReader bis = new BufferedReader(fis);
		System.out.println((char) bis.read());
		System.out.println((char) bis.read());
		System.out.println((char) bis.read());
		System.out.println((char) bis.read());
	}
}
  