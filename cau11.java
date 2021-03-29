package baitap;

public class cau11 {
	public void a(int n) {
		int s = 1; int i=1;
		while(i<=n) {
			i++;
			if(i % 2 == 0) continue;
			s*=i;
			//System.out.println(s);
		}
		System.out.println(s);
	}
	public void b(int n) {
		int s = 1;
		for(int i = 1 ; i <= n ; i++) {
			if(i % 2 == 0) {
				s*=i;
			}
		}
		System.out.println(s);
	}
	public static void main(String [] ar) {
		cau11 d1 = new cau11();
		d1.a(9);//n le
		d1.b(6);//n chan
	}
}
