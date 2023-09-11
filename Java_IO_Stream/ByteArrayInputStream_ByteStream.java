package Java_IO_Stream;

import java.io.*;

public class ByteArrayInputStream_ByteStream {
	public static void main(String[] args) throws Exception {
		byte b[] = { 'a', 'b', 'c', 'd', 'a', 'b', 'c' };
		ByteArrayInputStream bis = new ByteArrayInputStream(b);  
		int a;
		while ((a = bis.read()) != -1) {
			System.out.print((char) a);
		}

		System.out.println("\n" +bis.markSupported());

		// we can also write to print array in place of line 9 10 11 12
//		String arr = new String(bis.readAllBytes());
//		System.out.println(arr);

		bis.close();
	}
}
