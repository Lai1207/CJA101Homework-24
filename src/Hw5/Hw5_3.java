package Hw5;

public class Hw5_3 {
	int list[] = {};

	public static void genAuthCode() {

		for (int i = 0; i < 8; i++) {
			int x = (int) (Math.random() * 65) + 48;
			if ((x < 65 && x > 57) || (x > 90 && x < 97)) {
				i--;
			}else {
				System.out.print((char)x);
			}
		}
	}

//	48-57 65-90 97-112
	public static void main(String[] args) {
//		System.out.println((char)65);
//		System.out.println((int) (Math.random() * 65) + 48);
		genAuthCode();
	}

}
