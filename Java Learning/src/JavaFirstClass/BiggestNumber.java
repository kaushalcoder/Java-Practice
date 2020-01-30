package JavaFirstClass;

public class BiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int b=Integer.parseInt(args[0]);
			int n;
			for(int i=1;i<args.length;i++)
			{
				n=Integer.parseInt(args[i]);
				if(b<n)
					b=n;
			}
			System.out.println("Biggest number is "+b);
					
		}

	}

