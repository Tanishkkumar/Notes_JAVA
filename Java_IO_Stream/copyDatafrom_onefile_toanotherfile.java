package Java_IO_Stream;

import java.io.*;

public class copyDatafrom_onefile_toanotherfile {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:/Users/Tanishk kumar/Desktop/MyJava/c1.txt");
		FileOutputStream fos = new FileOutputStream("C:/Users/Tanishk kumar/Desktop/MyJava/cs1.txt");

		int b;
		while ((b = fis.read()) != -1) {
			if (b >= 65 && b <= 90) {
				fos.write(b + 32);
			} else {
				fos.write(b);
			}
		}
		fis.close();
		fos.close();
	}
}
