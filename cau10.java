package baitap;

public class cau10 {
	public void tinhtong(int n) {
		double s=0;double i = 1;double fact = 1;
		for(;i<=2*n-1;i++) {
			fact = fact * i;
			if(i % 2 != 0) {			
			s+=1/fact;
		}}
		System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cau10 d1 = new cau10();
		d1.tinhtong(6);
	}

}
