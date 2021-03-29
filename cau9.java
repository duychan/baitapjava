package baitap;

public class cau9 {
	public double tinhtong(double n) {
		double s = 15; double fact = 1;
		for(double i = 1;i<=n;++i) {
			fact = i*fact;
			if(i % 2 == 0) {
				s+=1/fact;
				//System.out.println("+ ," + i +","+ fact); test
			}
			else {
				s-=1/fact;
				//System.out.println("- ," + i +","+ fact); test
			}
			// System.out.println(s); test
		}
		System.out.println(s);
		return s;
	}
	public static void main(String [] a) {
		cau9 d1 = new cau9();
		d1.tinhtong(4);
	}

}
