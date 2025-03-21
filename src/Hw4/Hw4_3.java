package Hw4;

public class Hw4_3 {
	public static void main(String[] args) {
		String s[] = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int sum =0;
		for (int i = 0; i < s.length; i++) {
//			System.out.println(s[i]);
			for (int j = 0; j < s[i].length(); j++) {

				if (s[i].charAt(j)== 'a' || s[i].charAt(j)== 'e' || s[i].charAt(j)== 'i' || s[i].charAt(j)== 'o' || s[i].charAt(j)== 'u') {
					sum++;
					System.out.println("找到母音: " + s[i].charAt(j) + " 在單字: " + s[i]);
				}
			}
		}
		System.out.println("母音總共有:"+sum);
	}
}
