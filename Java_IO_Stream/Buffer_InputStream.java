package Java_IO_Stream;

import java.io.*;

public class Buffer_InputStream {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:/Users/Tanishk kumar/Desktop/MyJava/byteout.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		int a;
//		while ((a = bis.read()) != -1) {
//			System.out.println((char) a);
//		}
//		System.out.println("file-->"+fis.markSupported());
//		System.out.println("Buffer-->"+bis.markSupported());
		System.out.println((char)bis.read());
		System.out.println((char)bis.read());
		System.out.println((char)bis.read());
		System.out.println((char)bis.read());
	}
}
