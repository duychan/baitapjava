package baitap;
public class cau1 {
	public void timmax(int a , int b , int c) {
		int max  = (a > b && a > c) ? a : ( b > c ) ? b : c;
		System.out.println("max la a " + max);
	}
	public static void main(String [] agrs) {
		
		cau1 d1 = new cau1();
		d1.timmax(5,2,3);
	}
}
