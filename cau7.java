package baitap;
public class cau7 {
	public void ngaythang(int n , int m) {
		if(n>0 && n<=12) {
			switch(n) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println("thang " +n+ " co 31 ngay"); break;
			case 4: case 6: case 9: case 11:
				System.out.println("thang "+n+" co 30 ngay"); break;
			case 2:
				if(m % 4 == 0) {
					System.out.println("thang 2 cua nam "+m+" co 29 ngay");
				}
				else {
					System.out.println("thang 2 cua nam "+m+" co 28 ngay");
				}
			}
		}
		else {
			System.err.println("thang "+n+"?");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cau7 d1 = new cau7();
		d1.ngaythang(13,2021);
	}

}
