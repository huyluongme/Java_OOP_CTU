package buoi2;

import java.util.Scanner;

public class Date {
	private int ngay, thang, nam;
	
	public Date(){
		ngay = 14;
		thang = 9;
		nam = 2022;
	}
	
	public Date(int ngay1, int thang1, int nam1){
		ngay = ngay1;
		thang = thang1;
		nam = nam1;
	}
	
	public void inNgay(){
		System.out.print(ngay + "/" + thang + "/" + nam);
	}
	
	public void nhapNgay(){
		Scanner sc = new Scanner(System.in);
		do{
			System.out.print("Nhap ngay: ");
			ngay = sc.nextInt();
			System.out.print("Nhap thang: ");
			thang = sc.nextInt();
			System.out.print("Nhap nam: ");
			nam = sc.nextInt();
			if(!hople()) System.out.println("Ngay khong hop le, vui long nhap lai!");
		}while(!hople());
	}
	
	public Date ngayHomSau(){
		Date res = new Date(ngay, thang, nam);
		res.ngay++;
		if(!res.hople()){
			res.ngay = 1;
			res.thang++;
			if(!res.hople()){
				res.thang = 1;
				res.nam++;
			}
		}
		return res;
	}
	
	public Date congNgay(int n){
		Date res = new Date(ngay, thang, nam);
		for(int i = 0; i < n; i++)
			res = res.ngayHomSau();
		return res;
	}
	
	public boolean hople(){
		int day_in_month[] = {0, 31,28,31,30,31,30,31,31,30,31,30,31};
		if((nam%4==0 && nam%100!=0) || nam%400 == 0) day_in_month[2] = 29;
		if(ngay > 0 && thang > 0 && thang <13 && ngay <= day_in_month[thang])
			return true;
		return false;
	}
	
}
