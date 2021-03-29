package baitap;

public class cau8 {
	public double tinhtong(double n) {
		double s=0;
		for(double i=1;i<=n;i++) {
			s+=1/i;
		}
		System.out.println(s);
		return s;
	}
	public static void main(String [] a) {
		cau8 d1 = new cau8();
		d1.tinhtong(10);
	}
}
