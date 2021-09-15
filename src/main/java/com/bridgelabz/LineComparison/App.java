package com.bridgelabz.LineComparison;

import java.util.Scanner;

public class App {

	public double checkLineLength(int x1, int x2, int y1, int y2) {
		double len = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		return len;
	}

	public void compareLine(double lin1, double lin2) {

		int comp;
		String line1, line2;

		line1 = Double.toString(lin1);
		line2 = Double.toString(lin2);

		comp = line1.compareTo(line2);
		System.out.println("Both line are equal : " + line1.equals(line2));
		if (comp == 0) {
			System.out.println("Line 1 is equals to line 2");
		} else if (lin1 > lin2) {
			System.out.println("Line 1 is greater then line2");
		} else {
			System.out.println("Line 2 is greater then line 1");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x1, x2, y1, y2, m1, m2, n1, n2;
		double length1, length2;

		System.out.println("Hello welcome to line comparison computation program on master branch");
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
		scan.close();

		App cl = new App();
		length1 = cl.checkLineLength(x1, x2, y1, y2);
		length2 = cl.checkLineLength(m1, m2, n1, n2);
		System.out.println("Length of line 1 : " + length1);
		System.out.println("Length of line 2 : " + length2);

		cl.compareLine(length1, length2);
	}
}
