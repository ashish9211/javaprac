import java.util.*;
class ArrayFun
{
public static void main(String[] args)
{
int a,b,c,d;

//declaring  first square matrix
System.out.println("Enter the number of rows in the square matrix:");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
System.out.println("Enter the number of columns in the square matrix");
b=sc.nextInt();
int[][] m1=new int[a][b];

//declaring second square matrix
System.out.println("Enter the number of rows of the second matrix");
c=sc.nextInt();
System.out.println("Enter the number of columns of the second matrix");
d=sc.nextInt();
int[][] m2=new int[c][d];

//intializing first square matrix
System.out.println("Enter the elements into "+a+"x"+b+" matrix 1");
for(int i=0;i<a;i++)
{
for(int j=0;j<b;j++)
{
m1[i][j]=sc.nextInt();
}
}

//Intializing second square matrix
System.out.println("Enter the elements into "+c+"x"+d+" matrix 2");
for(int i=0;i<c;i++)
{
for(int j=0;j<d;j++)
{
m2[i][j]=sc.nextInt();
}
}
//condition for matrix addtition
if(a==c&&b==d)
{
System.out.println("The condition for matrix addition is satisfied. ");
//Matrix addition
int[][] sum=new int[a][d];
for(int i=0;i<a;i++)
{
for(int j=0;j<b;j++)
{
sum[i][j]=m1[i][j]+m2[i][j];
}
}
//displaysum
System.out.println("The sum of the given matrices is: ");
System.out.println();
for(int i=0;i<a;i++)
{
for(int j=0;j<d;j++)
{
System.out.print(sum[i][j]+" ");
}
System.out.println();	
}
}
else
{
System.out.println("The condition for matrix addition doesnt satisfy.");
}
int[][] prod=new int[b][c];

//condition for multiplying two matrices
if(b==c)
{
System.out.println("The condition for matrix multiplication is satisfied.");
System.out.println();
//Matrix multiplication
for(int i=0;i<a;i++)
{
for(int j=0;j<d;j++)
{
for(int k=0;k<b;k++)
{
prod[i][j]=prod[i][j]+m1[i][k]*m2[k][j];
}
}
}
//Displaying the product
System.out.println("The product of two matrices is: ");
for(int i=0;i<a;i++)
{
for(int j=0;j<d;j++)
{
System.out.print(prod[i][j]+" ");
}
System.out.println();
}
}
else
{
System.out.println("The condition for matrix multiplication is not satisfied");
}
}
}
	