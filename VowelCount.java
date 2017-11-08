import java.util.*;
class VowelCount
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a text input:");
String s=sc.nextLine();
String str=s.toLowerCase();
char c[]=str.toCharArray();
int count=0;
for(int i=0;i<c.length;i++)
{
if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
count++;
}
System.out.println("Number of vowels in the given text is: "+count);
}

}
	