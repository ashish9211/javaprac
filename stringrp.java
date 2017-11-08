import java.util.*;
class stringrp
{
String s,rev;
int len;

public void disp()
{
System.out.println("String entered is: "+s);
System.out.println();
}



public void reverse()
{
char[] c=s.toCharArray();
System.out.println("the reversed string is: ");
for(int i=c.length-1;i>=0;i--)
{
System.out.print(c[i]);
}
System.out.println();
}

public void ifPalin()
{
int count=0;
char[] c=s.toCharArray();
for(int i=0;i<(c.length/2);)
{
if(c[i]==c[c.length-1-i])
{
count=1;
i++;
}
else
{
i=c.length;
count=0;
}
}
if(count==1)
System.out.println("The given string "+s+" is a palindrome");
else
System.out.println("The given string " +s+" is not a palindrome");
}


public static void main(String[] args)
{
stringrp a=new stringrp();
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string");
a.s=sc.nextLine();
a.disp();
a.reverse();
a.ifPalin();
}
}	