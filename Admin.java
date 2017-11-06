import java.util.*;
class Student
{
String name;
int age;
int count=0;
String id;
final static String sname="NIIT";
public String returnId()
{
String s=sname.substring(0,3);
count++;
id=s+count;
return id;
}
public boolean checkStu(String sub)
{
boolean b=name.contains(sub);
return b;
}
}
class Admin
{
public static void main(String[] args)
{
System.out.println("Enter name of the Student:");
Scanner sc=new Scanner(System.in);
Student s=new Student();
s.name=sc.nextLine();
System.out.println("Enter age of the Student:");
s.age=sc.nextInt();
String id=s.returnId();
System.out.println("The student "+s.name+" of age "+s.age+" is registered with the id: "+id);

System.out.println("Enter the name to be searched");
String sub=sc.next();
boolean b=s.checkStu(sub);
if(b==true)
System.out.println("The name is present in: "+s.name);
else
System.out.println("The name is not present in: "+s.name);

}
}