package programing;

import java.util.Scanner;

public class ChangeTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x == 0 && y == 0) break;
			if(x > y) {
				int z = x;
				x = y;
				y = z;
			}
			
			System.out.println(x + " " + y);
		}
		
		sc.close();
	}

}
