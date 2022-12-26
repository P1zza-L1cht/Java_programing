package programing;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int h = 0;
		int m = 0;
		int s = 0;
		
		while(true) {
			if(S >= 3600) {
				h += 1;
				S -= 3600;
				continue;
			} else if(S >= 60) {
				m += 1;
				S -= 60;
				continue;
			} else {
				s = S;
				break;
			}
		}
		
		System.out.println(h + ":" + m + ":" + s);
		sc.close();
	}

}
