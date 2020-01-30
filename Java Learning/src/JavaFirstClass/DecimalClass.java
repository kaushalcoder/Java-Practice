package JavaFirstClass;

import java.util.Scanner;

public class DecimalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number ");
		int num=MyClass.sc.nextInt();
		System.out.println("Number of Octal is:" +Integer.toOctalString(num));
		System.out.println("Number of Binary is:" +Integer.toBinaryString(num));
		System.out.println("Number of hex is:" +Integer.toHexString(num));

	}

}
