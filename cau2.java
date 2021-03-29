package baitap;
public class cau2 {
	public double timnghiem(double  a,double b) {
		if(a == 0) {
			System.out.println("phuong trinh vo nghiem");
		}
		else if(b == 0){
			System.out.println("phuong trinh co vo so nghiem");}		
		else {
			System.out.println("nghiem cua pt "+a+"x + "+b+" = 0 la: " + -b/a);
		}
		return -b/a;
	}
	public static void main(String[] args) {
		cau2 d1 = new cau2();
		d1.timnghiem(2,3);
	}

}
