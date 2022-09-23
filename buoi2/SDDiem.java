package buoi2;

public class SDDiem {

	public static void main(String[] args) {
		Diem A = new Diem(3, 4);
		System.out.print("Toa do diem A: ");
		A.hienThi();
		
		Diem B = new Diem();
		System.out.println("Nhap toa do diem B: ");
		B.nhapDiem();
		System.out.print("Toa do diem B: ");
		B.hienThi();
		
		Diem C = new Diem(-B.giatriX(), -B.giatriY());
		System.out.print("Toa do diem C: ");
		C.hienThi();
		
		System.out.println("Khoang cach BO: " + B.khoangCach());
		System.out.println("Khoang cach AB: " + A.khoangCach(B));
	}

}
