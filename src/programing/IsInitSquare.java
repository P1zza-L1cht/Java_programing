package programing;

import java.util.Scanner;

public class IsInitSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt();
		int height = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		boolean isWidth;
		boolean isHeight;
		
		if((x-r) >= 0 && (x+r) <= width) {
			isWidth = true;
		} else {
			isWidth = false;
		}
		
		if((y-r) >= 0 && (y+r) <= height) {
			isHeight = true;
		} else {
			isHeight = false;
		}
		
		if(isWidth && isHeight) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		sc.close();
	}

}
