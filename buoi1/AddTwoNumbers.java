package buoi1;

import java.util.Scanner;

public class AddTwoNumbers {
	
	public int nhap() {
		Scanner sc = new Scanner(System.in);
		int n;
		String s;
		do {
			System.out.print("Nhap 1 so nguyen: ");
			s = sc.nextLine();
			try { n = Integer.parseInt(s);}
			catch (NumberFormatException e){
				n = Integer.MAX_VALUE;
				System.out.println("Sai dinh dang, vui long nhap lai!");
			}
		}while(n == Integer.MAX_VALUE);
		return n;
	}

	public static void main(String[] args) {
		AddTwoNumbers t = new AddTwoNumbers();
		int a = t.nhap();
		int b = t.nhap();
		System.out.println("Tong = " + (a + b));
	}

}
