package Hw4;
import java.util.Scanner;
public class Hw4_4 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int x [][] = {
				{25,2500},
				{32,800},
				{8,500},
				{19,1000},
				{27,1200}
		};
		int input = sc.nextInt();
		int sum = 0;
		System.out.print("員工編號:");
		for(int i = 0 ; i<x.length;i++) {
			if(x[i][1]<=input) {
				System.out.print(x[i][0]+" ");
				sum++;
			}
			
		}
		System.out.println("共"+sum+"人");
	}
}
