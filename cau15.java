package baitap;

public class cau15 {
	public static void main(String [] agrs) {
		cau15 d1= new cau15();
		d1.chinhp(6);
		d1.chinhp(9);
	}
	public boolean kiemtra(int m) {
		if(m<=0) return false;
		for(int i=0;i*i<=m;i++) {
			if(m == i*i)  return true;			
		}
		return false;
	}
	public void chinhp(int m) {
		if(kiemtra(m)) {
			System.out.println(m+" la so chinh phuong");
		}
		else {
			System.out.println(m+" khong phai so chinh phuong");
		} 
	}
}
