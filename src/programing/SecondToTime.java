package programing;

import java.util.Scanner;

public class SecondToTime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("秒数を入力して下さい：");
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
