import java.util.*;
class arraySort
{
public static void main(String[] args)
{
int x;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the desired number of elements in the array");
x=sc.nextInt();
int[] a=new int[x];
System.out.println("Enter the integer elements into the array");
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
System.out.println();
System.out.println("The values of the array are:");
for(int i=0;i<a.length;i++)
{
System.out.print(a[i]+" ");
}
int temp=0;
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a.length;j++)
{
if(a[i]<a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println();
System.out.println();
System.out.println("The array sorted in ascending order is: ");
for(int i=0;i<a.length;i++)
{
System.out.print(a[i]+" ");
}
System.out.println();
System.out.println();
System.out.println("The array sorted in descending order is: ");

for(int i=(a.length-1);i>=0;i--)
{
System.out.println(a[i]+" ");
}

}
}
	