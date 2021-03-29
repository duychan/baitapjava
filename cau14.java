package baitap;

public class cau14 {
	public boolean nguyent(int m) {
		if(m<=1) return false;
		for(int i = 2;i<m;i++) {
			if(m%i ==0) 
				return false;
			}
				return true;
			}	
	public void nguyent1(int m) {
		if(nguyent(m)) {
			System.out.println(m+ " la so nguyen to");
		}
		else
		{
			System.out.println(m+ " khong la so nguyen to");
		}
	}
	public static void main(String [] agsr) {
		cau14 s = new cau14();
		s.nguyent1(6);
		s.nguyent1(3);
	}

public void a(int m) {
	if(m<=1) {
		System.out.println("khong phai la so nguyen to");
	}}}

				