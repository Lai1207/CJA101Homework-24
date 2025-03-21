package Hw4;

public class Hw4_6 {
	public static void main(String[] args) {
		int x[][] = { { 10, 37, 100, 77, 98, 90 }, { 35, 75, 70, 95, 70, 80 }, { 40, 77, 79, 70, 89, 100 },
				{ 100, 89, 90, 89, 90, 75 }, { 90, 64, 75, 60, 75, 50 }, { 85, 75, 70, 75, 90, 20 },
				{ 75, 70, 79, 85, 89, 99 }, { 70, 95, 90, 89, 90, 75 }, };
		int sum = 0;
//		System.out.print(x[1][0]);
		for (int i = 0; i < x[0].length; i++) {
			for (int j = 0; j < x.length; j++) {
				int b =0;
				t:
				for (int a = 0; a < x.length; a++) {
					if (j==a) {
						continue;
					}
					if (x[j][i]>x[a][i]) {
						b++;
					}else {
						break t;
					}
					if (b>=7) {
						System.out.println(i+1+"獲勝");
					}
					System.out.println(x[j][i]);
					System.out.println(x[a][i]);
					System.out.println();
				}
			}
		}
	}
}
