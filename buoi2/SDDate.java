package buoi2;

import java.util.Scanner;

public class SDDate {

	public static void main(String[] args) {
		Date d1 = new Date(30, 6, 2007);
		System.out.print("Ngay 1: ");
		d1.inNgay();
		
		Date d2 = new Date();
		System.out.println("\nNhap ngay 2");
		d2.nhapNgay();
		System.out.print("Ngay 2: ");
		d2.inNgay();
		
		Date ngayhomsau = d1.ngayHomSau();
		System.out.println("\nNgay hom sau cua ngay 1: ");
		ngayhomsau.inNgay();
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhay ngay cong: ");
		n = sc.nextInt();
		Date ngaycongthem = d2.congNgay(n);
		System.out.println("Ngay cong them " + n + " ngay cua ngay 2 la:");
		ngaycongthem.inNgay();
	}

}