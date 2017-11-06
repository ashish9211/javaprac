import java.util.*;
class Armstrong
{
int count,num,sum=0	;
public void calcCount()
{
int n;
n=num;
while(n>0)
{
count++;
n=n/10;
}
System.out.println("the number of digits in the given number is: "+count);
}
public void calcArms()
{
int temp,n;
n=num;
while(n>0)
{
temp=n%10;
sum=sum+(int)Math.pow(temp,count);
n=n/10;
}
}	
public void display()
{
if (sum==num)
System.out.println("The given number: "+num+" is an Armstrong number");
else
System.out.println("The given number: "+num+" is not an Armstrong number");
}
public static void main(String[] args)
{
System.out.println("Enter any integer number to check if it is an Armstrong number or not:");
Scanner sc=new Scanner(System.in);
Armstrong a=new Armstrong();
a.num=sc.nextInt();
a.calcCount();
a.calcArms();
a.display();
}
}
	