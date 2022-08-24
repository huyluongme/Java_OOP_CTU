package buoi1;

import java.util.Scanner;
import java.lang.Math;

public class GPTrinh {

	public static void gptb1(double a, double b) {
		if (a == 0) {
			if (b == 0)
				System.out.println("Phuong trinh co vo so nghiem");
			else
				System.out.println("Phuong trinh vo nghiem");
		} else {
			System.out.println("Phuong trinh co nghiem x = " + (-b / a));
		}
	}

	public static void gptb2(double a, double b, double c) {
		if (a == 0)
			GPTrinh.gptb1(b, c);
		else {
			double delta = b * b - 4 * a * c;
			if (delta < 0)
				System.out.println("Phuong trinh vo nghiem");
			else if (delta == 0) {
				double x = -b / (2 * a);
				System.out.println("Phuong trinh co nghiem kep x = " + x);
			} else {
				double x1 = (-b - Math.sqrt(delta)) / (2 * a);
				double x2 = (-b + Math.sqrt(delta)) / (2 * a);
				System.out.println("Phuong trinh co 2 nghiem phan biet:");
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = 0, b = 0, c = 0;
		System.out.print("Nhap he so a: ");
		a = sc.nextDouble();
		System.out.print("Nhap he so b: ");
		b = sc.nextDouble();
		System.out.print("Nhap he so c: ");
		c = sc.nextDouble();
		GPTrinh.gptb2(a, b, c);
	}

}
