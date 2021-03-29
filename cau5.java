package baitap;
public class cau5 {
	public void trunggian(int a , int b, int c) {
		 if(b<c && b>a || b>c && b<a) {
			 System.out.println(b); 
		 }
		 else
		 if(a>b && a<c || a>c && a<b) {
			 System.out.println(a);
		 }
		 else {
			 System.out.println(c);
		 }
	}
	public static void main(String [] aa) {
		cau5 d1 = new cau5();
		d1.trunggian(2,6,7);
	}
}
 

