package hw2;

public class hw2 {
	public static void main(String[] args) {
		int count = 2;
		int sum = 0;
		while (count <= 1000) {
			sum += count;
			count += 2;
		}
		System.out.println(sum);

		int j;
		int a = 1;
		for (j = 2; j <= 10; j++) {
			a *= j;
		}
		System.out.println(a);

		j = 2;
		a = 1;
		while (j <= 10) {
			a *= j;
			j++;
		}
		System.out.println(a);

		j = 1;
		while (j <= 10) {
			System.out.print((int) (Math.pow(j, 2)) + " ");
			j++;
		}
		System.out.println();

		j = 0;
		outer: while (j < 49) {
			j++;
			if (j % 4 == 0) {
				continue outer;
			}

			if (j / 10 != 0) {
				if (j / 10 == 4 || j % 10 == 4) {
					continue outer;
				}
			}

			System.out.print(j + " ");
		}
		System.out.println();
		j = 10;
		while (j > 0) {
			for (int i = 1; i <= j; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			j--;
		}
		j = 65;
		while (j <= 70) {
			for (int i = 0; j >= i + 65; i++) {
				System.out.print((char) j);
			}
			System.out.println();
			j++;
		}
		for (int i = 1; i <= 9; i++) {
			 j = 1;
			while (j <= 9) {
				System.out.println(i + "x" + j + "=" + i * j);
				j++;
			}
		}
		for (int i = 1; i <= 9; i++) {
			int x = 1;
			do {
				System.out.println(i + "x" + x + "=" + i * x);
				x++;
			} while (x <= 9);
		}
		int i = 1;
		while (i <= 9) {
			int x = 1;
			do {
				System.out.println(i + "x" + x + "=" + i * x);
				x++;
			} while (x <= 9);
			i++;
		}

	}

}
