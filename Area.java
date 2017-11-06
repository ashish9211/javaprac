import java.util.*;
class Area
{
int len,bre,side,arr,ars;
float arc,rad;
final static float pi=3.14f;
public void calcArea()
{
arr=len*bre;
ars=side*side;
arc=pi*rad*rad;
}
public void display()
{
System.out.println("The Area of the Rectangle for the given values of length("+len+"units) and breadth("+bre+"units) are= "+arr+"sq.units");
System.out.println("The Area of the square for the given value of side("+side+"units) is= "+ars+"sq.units");
System.out.println("The Area of the Circle for the give radius("+rad+"units) is = "+arc+"sq.units");
}
public static void main(String[] args)
{
System.out.println("Enter the values of length and breadth respectively");
Scanner sc=new Scanner(System.in);
Area a=new Area();
a.len=sc.nextInt();
a.bre=sc.nextInt();
System.out.println("Enter the value of the side");
a.side=sc.nextInt();
System.out.println("Enter the radius of the Circle");
a.rad=sc.nextFloat();
a.calcArea();
a.display();



}
}


	