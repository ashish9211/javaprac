import java.util.*;
class stringFun
{
static String s;
public static void main(String[] args)
{
System.out.println("Enter the String");
Scanner sc=new Scanner(System.in);
s=sc.next();

System.out.println("the given string is: "+s);
char a=s.charAt(3);
System.out.println("the character a the given index of the string is"+a);

int l=s.length();
System.out.println("Length of the String is: "+l);

String sl=s.toLowerCase();
System.out.println("String converted to lower case:"+sl);

String su=s.toUpperCase();
System.out.println("String converted to upper case:"+su);

String con=s.concat("newString");
System.out.println("the new String is :"+con);

int x=s.compareTo("Java");
System.out.println("Result after comparing strings with compareTo: "+x);
String j="va";
boolean e=s.endsWith(j);
System.out.println("The string ends with va?- "+e);

boolean c=sl.equalsIgnoreCase(su);
System.out.println("The two strings match?- "+c);

int h=s.hashCode();
System.out.println("Hash code of the String is: "+h);

int i=s.indexOf("J");
System.out.println("the index of 'J' in the given string is:"+i);

boolean emp=s.isEmpty();
System.out.println("the given string is empty?- "+emp);

int ch=s.lastIndexOf("a");
System.out.println("the last index of the given character is: "+ch);

String r=s.replace("C","M");
System.out.println("The string with the replaced character is: "+r);

String ra=s.replaceAll("Core","Advanced");
System.out.println("The replaced String is: "+ra);

String sub=s.substring(4);
System.out.println("The substring obtained from index '4' is: " +sub);

}
}

	