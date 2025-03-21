package Hw4;

public class Hw4_1 {
	public static void main(String[] args) {
		int arrays[] = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;
		for (int i = 0; i < arrays.length; i++) {
			sum += arrays[i];
		}
		System.out.println("平均值:" + sum / arrays.length);
		System.out.print("大於平均值的數:");

		for (int j = 0; j < arrays.length; j++) {
			if (arrays[j] > sum / arrays.length) {
				System.out.print(arrays[j] + " ");
			}
		}
	}

}
