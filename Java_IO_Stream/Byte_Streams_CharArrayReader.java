package Java_IO_Stream;

import java.io.*;

public class Byte_Streams_CharArrayReader {
	public static void main(String[] args) throws Exception {
		byte b[] = { 'a', 'b', 'c' };
		ByteArrayInputStream_ByteStream bis = new ByteArrayInputStream_ByteStream(b);
		int a;
		while ((a = bis.read()) != -1) {
			System.out.print((char) a + " "); // type cast to char
		}

		// second method to read byte array
//		String str=new String(bis.readAllBytes());
//		System.out.println(str);  
		//   System.out.println(bis.markSupported());
		bis.close();
	}
}
