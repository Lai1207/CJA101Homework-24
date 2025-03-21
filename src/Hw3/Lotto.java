package Hw3;

import java.util.Scanner;

public class Lotto {
	public static void autoNum(int x[], int sum) {
		System.out.println("隨機選號:");
		int r[] = new int[6];
		for (int i = 0; i <= 5; i++) {
			int z = (int) (Math.random() * sum) + 1;
			r[i] = x[z];
			System.out.println(x[z]);

		}
	}

	public int[] numList(int x) {
		int sum = 0;
		int y[] = new int[49];
		for (int i = 1; i <= 49; i++) {
			if (i == x || i / 10 == x || i % 10 == x) {
				continue;
			} else {
				y[sum] = i;
				System.out.print(i + "\t");
				sum++;
			}
			if (sum % 6 == 0) {
				System.out.println();
			}

		}

		System.out.println("總共有" + sum + "可以選");
		autoNum(y, sum);
		return y;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Lotto li = new Lotto();
		li.numList(num);

	}

}
