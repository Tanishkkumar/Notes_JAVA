package Java_IO_Stream;

import java.io.*;

public class Char_ArrayWriter {
	public static void main(String[] args) throws Exception {
		CharArrayWriter cw = new CharArrayWriter(20);
		cw.write("welcome to world");
		char[] ptr = cw.toCharArray();
		FileOutputStream ob = new FileOutputStream("C:/Users/Tanishk kumar/Desktop/MyJava/c3.txt");
		for (char a : ptr) {
			ob.write(a);
		}
		cw.close();
	}
}
