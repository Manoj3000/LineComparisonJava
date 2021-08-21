package com.bridgelabz.LineComparison;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner scan = new Scanner(System.in);
    	int x1, x2, y1, y2, m1, m2, n1, n2, comp;
    	double length1, length2;
    	String line1, line2;
        System.out.println( "Hello welcome to line comparison computation program on master branch" );
        System.out.print("Enter value of (x1 y1) (x2 y2) : ");
        x1 = scan.nextInt();
        y1 = scan.nextInt();
        x2 = scan.nextInt();
        y2 = scan.nextInt();
        System.out.print("Enter value of (m1 n1) (m2 n2) : ");
        m1 = scan.nextInt();
        n1 = scan.nextInt();
        m2 = scan.nextInt();
        n2 = scan.nextInt();

        length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        length2 = Math.sqrt(Math.pow(m2 - m1, 2) + Math.pow(n2 - n1, 2));
        System.out.println("Length of line 1 : " +length1);
        System.out.println("Length of line 2 : " +length2);
        
        line1 =  Double.toString(length1);
        line2 =  Double.toString(length2);
        
        comp = line1.compareTo(line2);
        
        if(comp == 0) {
        	System.out.println("Line 1 is equals to line 2");			        	
        }
        else if (length1 > length2) {
			System.out.println("Line 1 is greater then line2");
		}
		else {
			System.out.println("Line 2 is greater then line 1");
		}

    }
}
