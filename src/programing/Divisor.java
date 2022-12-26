package programing;

import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("数字を三つ入力してください");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int count = 0;
		
		for(int i = a; i <= b; i++) {
			if(c % i == 0) {
				count++;
			}
		}
		
		System.out.println(count);
		sc.close();
	}

}
