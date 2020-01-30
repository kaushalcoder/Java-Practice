package JavaFirstClass;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//float n=5.6f;
		////long k=68L;
		//System.out.println(n);
		//System.out.println(k);
		//String name1="kaushal kukreja";
		//System.out.println("hello Dear"+name1);
		//System.out.printf("hello dear%s",name1);
		int vote;
		
		System.out.println("Enter your name");
		String name=MyClass.sc.next();
		System.out.println("Enter your age");
		int age=MyClass.sc.nextInt();
		if(age>18)
		{
			System.out.println("Dear"+name+"you can vote");
		}
		
		else
		{			
			vote= 18-age;
			System.out.println("Dear" +name+ "you can vote after" +vote+ "years");	
		}
				

	}

}
