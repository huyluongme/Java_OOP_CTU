package buoi2;

import java.util.Scanner;

public class SDPhanSo {

	public static void main(String[] args) {
		PhanSo a =  new PhanSo (3,7), b =  new PhanSo (4,9);
		System.out.print("Phan so a: ");
		a.inPhanSo();
		System.out.print("Phan so b: ");
		b.inPhanSo();
		
		PhanSo x = new PhanSo(),y = new PhanSo();
		System.out.println("Nhap phan so x:");
		x.nhapPhanSo();
		System.out.println("Nhap phan so y:");
		y.nhapPhanSo();
		System.out.print("Gia tri nghich dao cua phan so x: ");
		x.giaTriNghichDao().inPhanSo();
		
		PhanSo z = x.cong(y);
		System.out.print("Tong x + y = ");
		z.inPhanSo();
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Nhap n: ");
		n = sc.nextInt();
		PhanSo arr[] = new PhanSo[n];
		PhanSo sum = new PhanSo(), max = new PhanSo(Integer.MIN_VALUE, Integer.MAX_VALUE);
		for(int i = 0; i < n; i++){
			System.out.println("Nhap phan so thu " + (i+1));
			arr[i] = new PhanSo();
			arr[i].nhapPhanSo();
			sum = sum.cong(arr[i]);
			if(arr[i].lonHon(max)) max = arr[i];
		}
		
		System.out.print("Tong n phan so: ");
		sum.inPhanSo();
		System.out.print("Phan so lon nhat: ");
		max.inPhanSo();
		
		for(int i = 0; i < n - 1; i++){
			for(int j = n - 1; j > i; j--){
				if(arr[j - 1].lonHon(arr[j])){
					PhanSo tmp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println("Danh sach phan so sau khi sap xep: ");
		for(int i = 0; i < n; i++)
			arr[i].inPhanSo();
	}

}
