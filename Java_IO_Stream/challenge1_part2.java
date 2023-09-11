package Java_IO_Stream;

//to copy two file content in the third file.
import java.io.*;

public class challenge1_part2 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis1 = new FileInputStream("C:/Users/Tanishk kumar/Desktop/MyJava/c1.txt");
		FileInputStream fis2 = new FileInputStream("C:/Users/Tanishk Kumar/Desktop/MyJava/cs1.txt");
		FileOutputStream fos = new FileOutputStream("C:/Users/Tanishk kumar/Desktop/MyJava/c2.txt");

		SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
		int a;
		while ((a = sis.read()) != -1) {
			fos.write(a);
		}
		sis.close();
		fis1.close();
		fis2.close();
		fos.close();

	}
}
