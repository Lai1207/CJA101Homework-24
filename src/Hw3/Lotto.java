package Hw3;

import java.util.Scanner;

public class Lotto {
	public static void autoNum(int x) {
//		for (int i = 0; i <= 5; i++) {
//			Math.random()*x+1
//		}
	}

	public void numList(int x) {
		int sum = 0;
//		int y[] = new int[49];
		for (int i = 1; i <= 49; i++) {
			if (i == x || i / 10 == x || i % 10 == x) {
				continue;
			} else {
//				y[sum] = i;
				System.out.print(i + "\t");
				sum++;
			}
			if (sum % 6 == 0) {
				System.out.println();
			}

		}

		System.out.println("總共有" + sum + "可以選");
		autoNum(sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Lotto li = new Lotto();
		li.numList(num);

	}

}
