package Java_IO_Stream;

import java.io.*;

public class Char_ArrayReader {
	public static void main(String[] args) throws Exception {
		char[] c = { 't', 'a', 'n', 'i', 's', 'h', 'k' };
		CharArrayReader cr = new CharArrayReader(c);
		int x;
		while ((x = cr.read()) != -1) {
			System.out.print((char) x);
		}
		cr.close();
	}
}
