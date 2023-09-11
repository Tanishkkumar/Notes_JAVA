/*
 * In Java, when you read an integer value using a method like nextInt() ,
 * from the Scanner class or parse an integer using methods like parseInt(),
 *  from the Integer class, the method consumes only the numeric characters,
 *   and leaves the newline character or any other delimiter (such as a space),
 *    in the input stream.

*The problem you described typically occurs when you use the nextLine() method,
 *after reading an integer. The nextLine() method reads the remaining characters,
  *on the current line, which includes the newline character. As a result, it appears,
   *as if the nextLine() call is skipped, or it reads an empty string.
   
  *****************TO overcome this issue use SCANNER CLASS NAME.nextLine();--->a.nextLine() after a.nextInt();********************************************
 */

import java.util.*;

class myfirst {
	public static void main(String args[]) {
		String n;
		// System.out.println("hello world");
		Scanner a = new Scanner(System.in);
		System.out.print("enter the value in the field\n");
		int b = a.nextInt();

		a.nextLine(); // Consume the remaining newline character

		System.out.println("the value u entered is:::" + b);

		System.out.println("may i know your name");
		n = a.nextLine(); // nextLine ke case mai -->a.nextLine likhna hi padta hai..
		System.out.println("the line u have entered is:::" + n);

		a.close();

	}
}
