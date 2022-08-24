package buoi1;

import java.util.Arrays;
import java.util.Scanner;

public class DanhSach {

	int arr[];
	static Scanner sc = new Scanner(System.in);
	public void nhap() {
		System.out.print("Nhap n: ");
		int n = sc.nextInt();
		arr = new int[n];
		for(int i = 0; i < n; ++i){
			System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
	}
	
	public void xuat() {
		for(int e : arr)
			System.out.print(e + " ");
		System.out.println();
	}
	
	public int timkiem(int x) {
		int cnt = 0;
		for(int e : arr)
			if(e == x) ++cnt;
		return cnt;
	}
	
	public void sapxep() {
		for(int i = 0; i < arr.length - 1; ++i){
			for(int j = arr.length - 1; j > i; --j){
				if(arr[j] < arr[j - 1]){
					int tmp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = tmp;
				}
			}
		}
	}
	
	// Them phan tu co gia tri x vao vi tri p
	public void them(int p, int x) {
		if(p < 1 || p > arr.length) {
			System.out.println("Vi tri khong hop le!");
		}else {
			arr = Arrays.copyOf(arr, arr.length + 1);
			for(int i = arr.length - 1; i > p - 1; --i) 
				arr[i] = arr[i - 1];
			arr[p - 1] = x;
		}
	}
	
	// Sua gia tri cua phan tu tai vi tri p thanh gia tri x
	public void sua(int p, int x) {
		if(p < 1 || p > arr.length) {
			System.out.println("Vi tri khong hop le!");
		}else 
			arr[p - 1] = x;
	}
	
	// Xoa phan tu tai vi tri p
	public void xoa(int p) {
		if(p < 1 || p > arr.length) {
			System.out.println("Vi tri khong hop le!");
		}else {
			for(int i = p; i < arr.length; ++i)
				arr[i - 1] = arr[i];
			arr = Arrays.copyOf(arr, arr.length - 1);
		}
	}
	
	public static void main(String[] args) {
		DanhSach ds = new DanhSach();
		int x, y, p;
		ds.nhap();
		
		System.out.print("\nTim so luong so x. Nhap x: ");
		x = sc.nextInt();
		System.out.println("Danh sach co " + ds.timkiem(x) + " so " + x);
		
		System.out.print("\nThem phan tu x vao vi tri p\nNhap x: ");
		x = sc.nextInt();
		System.out.print("Nhap p: ");
		p = sc.nextInt();
		ds.them(p, x);
		System.out.println("Danh sach sau khi them phan tu " + x + " vao vi tri " + p);
		ds.xuat();
		
		System.out.print("\nSua gia tri phan tu tai vi tri p thanh gia tri x\nNhap x: ");
		x = sc.nextInt();
		System.out.print("Nhap p: ");
		p = sc.nextInt();
		ds.sua(p, x);
		System.out.println("Danh sach sau khi sua gia tri phan tu tai vi tri p thanh gia tri x:");
		ds.xuat();
		
		System.out.print("\nXoa phan tu tai vi tri p. Nhap p: ");
		p = sc.nextInt();
		ds.xoa(p);
		System.out.println("Danh sach sau khi xoa phan tu tai vi tri p:");
		ds.xuat();
		
		ds.sapxep();
		System.out.println("\nDanh sach sau khi sap xep tang dan:");
		ds.xuat();
	}

}
