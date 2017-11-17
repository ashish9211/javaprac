package demo1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Writingdata {

public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new FileReader(System.in));
		ArrayList al=new ArrayList();
		System.out.println("Enter the name and contact number of 5 persons respectively");
		for(int i=0;i<5;i++)
		{
        al.add(new Person(sc.next(),sc.nextInt()));
        
		}
       
        
        for(Object o:al)
        {
        	System.out.print(((Person)o).getName());
        	System.out.println(((Person) o).getAge());
        }
        
	}

}
