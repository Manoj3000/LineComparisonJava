package com.bridgelabz.LineComparison;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner scan = new Scanner(System.in);
    	int x1, x2, y1, y2;
    	double length;
        System.out.println( "Hello welcome to line comparison computation program on master branch" );
        System.out.print("Enter value of (x1 y1) (x2 y2) : ");
        x1 = scan.nextInt();
        y1 = scan.nextInt();
        x2 = scan.nextInt();
        y2 = scan.nextInt();

        length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Length of line : " +length);
    }
}
