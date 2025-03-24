package Hw5;

public class Hw5_2 {
	public static void randavg() {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			int x = (int) (Math.random() * 101);
			System.out.print(x + " ");
			sum = sum + x;
		}
		System.out.print("\n"+sum / 10);
	}

	public static void main(String[] args) {
		System.out.println("本次論數結果:");
		randavg();

	}

}
