package JavaFirstClass;

import java.io.*;
import java.util.*;

public class BufferReaderClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int vote;
		
		System.out.println("Enter name:");
		String name = MyClass.br.readLine();
		System.out.println("Enter age");
		int age = MyClass.sc.nextInt();
		if(age>18)
			System.out.println("Dear"+name+"you an vote");
		else
		{
			vote=18-age;
			System.out.println("Dear"+name+"you can vote after"+vote+"years");
		}

	}

}
