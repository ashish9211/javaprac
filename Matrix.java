import java.util.*;
public class Matrix {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the first matrix respectively");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int[][] m1=new int[a][b];
		
		System.out.println("Enter the number of rows and columns of the second matrix respectively");
		int c=sc.nextInt();
		int d=sc.nextInt();
		int[][] m2=new int[c][d];
		
		System.out.println("Enter the elements of the first matrix: ");
		for(int i=0;i<a;i++)
		{
		for (int j=0;j<b;j++)
		     {
			m1[i][j]=sc.nextInt();
		     }
		}
		System.out.println("Enter the elements of the second matrix: ");
		for(int i=0;i<c;i++)
		{
		for (int j=0;j<d;j++)
		     {
			m2[i][j]=sc.nextInt();
		     }
		}
		
		if(a==c&&b==d)
		{
			System.out.println("The number of rows and columns of both the matrices is equal.Hence the resultant Matrix from Addition is:");
			int sum[][]=new int[a][d];
			for(int i=0;i<a;i++)
			{
				for(int j=0;j<d;j++)
				{
					sum[i][j]=m1[i][j]+m2[i][j];
					System.out.print(sum[i][j]+" ");
				}
				System.out.println();
			}
		}
	}

}
