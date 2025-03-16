package Hw3;

import java.util.Scanner;

public class Triangle {
	public void Triangle(int x, int y, int z) {
		if (x+y>z && y+z>x && x+z>y) {
			if (x * x + y * y == z * z || y * y + z * z == x * x || z * z + x * x == y * y) {
				System.out.println("直角三角形");
			} else if (x == y && y == z && x == z) {
				System.out.println("正三角形");
			} else if(x == y || y == z || x == z) {
				System.out.println("等腰三角形");
			} else {
				System.out.println("其他三角形");
			}
		} else {
			System.out.println("不是三角形");
		}
			
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三角形邊邊長:");
		Triangle tr = new Triangle();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		tr.Triangle(x,y,z);
		sc.close();
	}

}
