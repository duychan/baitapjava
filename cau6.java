package baitap;
public class cau6 {
	public void tinhtien(int m, int n) {
		int s=0;
			if(n<18) {
				s=45000*(n-m);
			}
			else {
				s=60000*(n-m);
			}			
		
		System.out.println("Tong tien tu luc "+m+"h den luc "+n+"h la: " +s + " VND");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cau6 dt = new cau6();
			dt.tinhtien(16, 18);			
		}
	}


