package programing;

import java.util.Scanner;

public class Replacement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("数字を３つ入れてください。");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		while(true) {
			if(a <= b && b <= c) {
				break;
			} else {
				if(a > b) {
					int x = a;
					a = b;
					b = x;
				} else if(b > c) {
					int z = b;
					b = c;
					c = z;
				}
			}
		}
		System.out.println(a + " " + b + " " + c);
		
		sc.close();
	}

}
