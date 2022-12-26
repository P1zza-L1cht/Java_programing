package programing;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double r = sc.nextDouble();
		double area = Math.pow(r, 2) * Math.PI;
		double circle = r * 2 * Math.PI;
		
		System.out.println(String.format("%.8f", area) + " " + String.format("%.8f", circle));
		sc.close();
	}

}
