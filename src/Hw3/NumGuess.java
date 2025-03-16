package Hw3;
import java.util.Scanner;
public class NumGuess {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean x = true;
		int guessnum =(int) (Math.random()*101);
		while(x){
			
			int num = sc.nextInt();
			
			if (num ==guessnum) {
				System.out.println("答對了答案是 :" +guessnum);
				break;
			}else if (num > guessnum) {
				System.out.println("大於正確答案");
			}else if (num < guessnum) {
				System.out.println("小於正確答案");
			}
		}
	sc.close();
	}

}
