import java.util.*;
class TcnMo
{
final static double pi=3.14;
//Method Overloading
public void calcArea(int x,int y)
{
System.out.println("Area of the rectangle is: "+x*y+" sq.units.");
System.out.println("Perimeter of the rectangle is: "+2*(x+y)+" units.");
}

public void calcArea(float rad)
{
System.out.println("Area of the circle is: "+pi*rad*rad+" sq.units.");
System.out.println("Perimeter of the circle is: "+2*pi*rad+" units.");
}

public void calcArea(float rad,double height)
{
System.out.println("Area of the sphere is: "+pi*rad*rad*height+" sq.units.");
System.out.println("Perimeter of the sphere is: "+2*pi*rad*height+" units.");
}

public static void main(String[] args)
{
TcnMo tm=new TcnMo();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length and breadth of the rectangle respectively: ");
byte l=sc.nextByte();
byte b=sc.nextByte();

//implicit type casting or widening.
tm.calcArea(l,b);

System.out.println("Enter the radius of the circle: ");
double r=sc.nextDouble();

//ecplicit typecasting or narrowing.
tm.calcArea((float)r);
System.out.println("Enter radius and height of the sphere respectively: ");
double rad=sc.nextDouble();
float h=sc.nextFloat();

//explicit type casting or narrowing
tm.calcArea((float)rad,h);

}
}
	