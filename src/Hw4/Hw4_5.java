package Hw4;

import java.util.Scanner;

public class Hw4_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x[][] = { { 1, 31 }, { 2, 28 }, { 3, 31 }, { 4, 30 }, { 5, 31 }, { 6, 30 }, { 7, 31 }, { 8, 31 }, { 9, 30 },
				{ 10, 31 }, { 11, 30 }, { 12, 31 }, };
		int y[][] = { { 1, 31 }, { 2, 29 }, { 3, 31 }, { 4, 30 }, { 5, 31 }, { 6, 30 }, { 7, 31 }, { 8, 31 }, { 9, 30 },
				{ 10, 31 }, { 11, 30 }, { 12, 31 }, };
		int inyear = sc.nextInt();
		int inmon = sc.nextInt();
		int inday = sc.nextInt();
		int sum = 0;
		if (inyear % 4 == 0 && inmon <= 12 && y[inmon - 1][1] >= inday) {
			for (int i = inmon - 2; i >= 0; i--) {
				sum = sum + y[i][1];
			}
			sum = sum + inday;
			System.out.println(sum);
		} else if (inmon <= 12 && x[inmon - 1][1] >= inday) {
			for (int i = inmon - 2; i >= 0; i--) {
				sum = sum + x[i][1];
			}
			sum = sum + inday;
			System.out.println(sum);
		} else {
			System.out.println("輸入有誤");
		}

	}

}
