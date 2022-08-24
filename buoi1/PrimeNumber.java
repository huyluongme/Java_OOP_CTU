package buoi1;

import java.util.Scanner;
import java.lang.Math;

public class PrimeNumber {

	public static boolean isPrime(int n) {
		if(n <= 1) return false;
		else{
			for(int i = 2; i <= Math.sqrt(n); ++i)
				if(n % i == 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = sc.nextInt();
		if(isPrime(n))
			System.out.println(n + " la so nguyen to");
		else
			System.out.println(n + " khong la so nguyen to");
		System.out.println("Dang nhi phan cua " + n + " : " + Integer.toBinaryString(n));
	}

}
