package Hw6;

import java.util.Scanner;



public class CalTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入x:");
		int x = sc.nextInt();
		System.out.println("輸入y:");
		int y = sc.nextInt();
		try {
			Calculator c1 = new Calculator(x,y);
		}catch(CalException e) {
			e.printStackTrace();
		}
	}
}
