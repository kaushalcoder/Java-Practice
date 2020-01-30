package JavaFirstClass;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Enter the number in 3X4 matrix
		System.out.println("Enter the matrix number");
		int [][]num = new int[3][4];
		int i,j;
		for(i=0;i<3;i++)
			for(j=0;j<4;j++)
			{
				System.out.printf("Data is [%d][%d]=", i,j);
				num[i][j]=MyClass.sc.nextInt();
			}
		//Array is
		System.out.println("Array is");
		for(i=0;i<3;i++)
		{
			for(j=0;j<4;j++)
				System.out.printf("%d",num[i][j]);
			System.out.println();
		}
		//Transpose of Matrix is
		System.out.println("Transpose of Array is");
		System.out.println();
		for(i=0;i<4;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.printf("%d",num[j][i]);
				System.out.println();
			}
		}
		

	}

}
