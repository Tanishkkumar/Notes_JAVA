package Java_IO_Stream;

import java.io.*;

public class Character_ArrayReader {
	public static void main(String[] args) throws Exception {
		char c[] = { 'a', 'b', 'c', 'd', 'a', 'b', 'c' };
		CharArrayReader cr = new CharArrayReader(c);
		int a;
		while ((a = cr.read()) != -1) {
			System.out.println((char) a);
		}
		cr.close();
	}
}
