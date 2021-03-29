package baitap;

public class cau12 {
	public void tich(int m) {
		int s = 1;
		while(m!=0) {		
			s*=m%10;			
			m/= 10;					
		}
		System.out.println(s);
	}
	public void tong(int m) {
		int s = 1;
		while(m!=0) {		
			s+=m%10;			
			m/= 10;					
		}
		System.out.println(s);
	}
	public static void main(String [] agrs) {
		cau12 d1 = new cau12();
		d1.tich(234);
		d1.tong(123);
	}
	}

