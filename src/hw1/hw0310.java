package hw1;

public class hw0310 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9;i++) {
			int j = 1;
			while (j<=9) {
				System.out.println(i+"x"+j+"="+i*j);
				j++;
			}
		}
		for (int i = 1; i <= 9;i++) {
			int x=1;
			do {
				System.out.println(i+"x"+x+"="+i*x);
				x++;
			}while(x<=9);
		}
		int i =1;
		while(i<=9) {
			int x=1;
			do {
				System.out.println(i+"x"+x+"="+i*x);
				x++;
			}while(x<=9);
			i++;
		}
	}

}
