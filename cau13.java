package baitap;

public class cau13 {
	public int UCLN(int a,int b) {
		if(a == 0) return b;
		return UCLN(b%a,a);
	}
	public int BCNN(int x, int y) {
		if(x % y ==0) return x;
			return (x*y)/UCLN(x,y);
		}
	
	public static void main(String [] args) {
		cau13 d1 = new cau13();
		System.out.println(d1.UCLN(4,8));
		System.out.println(d1.BCNN(3,5));
}}
