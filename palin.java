import java.util.*;
class palin
{
String s;


public void checkPalin(StringBuffer s1)
{
String st1;

st1=(s1.reverse()).toString();
if(s.equals(st1))
System.out.println("The given string "+s+" is a palindrome ");
else
System.out.println("The given string "+s+" is not a palindrome ");
}

public static void main(String[] args)
{
System.out.println("enter a string to check if it is a palindrome or not");
palin p=new palin();
Scanner sc=new Scanner(System.in);
p.s=sc.nextLine();

StringBuffer s1=new StringBuffer(p.s);
p.checkPalin(s1);
}

}
