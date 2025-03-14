package hw1;

public class hw0308 {
	public static void main(String[] args) {
	// 1.
		int x = 12;
		int y = 6;
		System.out.println("和"+x+y);
		System.out.println("積"+x*y);
	// 2.
		int z =200;
		System.out.println(z/12+"打");
		System.out.println(z%12+"顆");
	//3.
		int time = 256559;
		int min = time/60;  //整除幾分鐘
		int sec = time%60;  //餘數剩餘秒數
		int hours = min/60; //整除小時
		int fmin = min%60;  // 餘數剩餘分鐘
		int day = hours/24; //整除天數
		int fhours = hours%24; // 剩餘小時
		System.out.println(day+"天"+fhours+"小時"+fmin+"分鐘"+sec+"秒");
	//4.
		double pi = 3.1415;
		int r = 5;
		System.out.printf("面積:%.2f 圓周長:%.2f%n",r*r*pi,r*2*pi);
	//5.
		int money = 1500000;
		double total=money*Math.pow((1+0.02),10);
		System.out.printf("總共:%.0f%n",total);
	//6.
		System.out.println(5+5);   //數值5加上數值5等於10 
		System.out.println(5+'5'); //'5' 的 ASCII 值是 53。
		System.out.println(5+"5"); //數值5加上字串5，後者不是數值所以不會相加變成55
	
	}

}
