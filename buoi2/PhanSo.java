package buoi2;

import java.util.Scanner;

public class PhanSo {
	private int tuso, mauso;
	
	public PhanSo(){
		tuso = 0;
		mauso = 1;
	}
	
	public PhanSo(int tu, int mau){
		tuso = tu;
		mauso = mau;
	}
	
	public void nhapPhanSo(){
		do{
			Scanner sc = new Scanner(System.in);
			System.out.print("Nhap tu so: ");
			tuso = sc.nextInt();
			System.out.print("Nhap mau so: ");
			mauso = sc.nextInt();
			if(!hople()) System.out.println("Mau so khong duoc bang 0, vui long nhap lai!");
		}while(!hople());
	}
	
	public void inPhanSo(){
		if(tuso == 0) System.out.println("0");
		else if(mauso == 1) System.out.println(tuso);
		else System.out.println(tuso + "/" + mauso);
	}
	
	public boolean hople(){
		return mauso != 0;
	}
	
	public void ngichDao(){
		int tmp = tuso;
		tuso = mauso;
		mauso = tuso;
	}
	
	public PhanSo giaTriNghichDao(){
		PhanSo res = new PhanSo(mauso, tuso);
		return res;
	}
	
	public float giaTriThuc(){
		return (float)tuso/mauso;
	}
	
	public boolean lonHon(PhanSo a){
		return giaTriThuc() > a.giaTriThuc();
	}
	
	
	public void rutGon(){
		int a = tuso, b = mauso, tmp;
		while(b != 0){
			tmp = a % b;
			a = b;
			b = tmp;
		}
		tuso = tuso/a;
		mauso = mauso/a;
	}
	
	public PhanSo cong(PhanSo a){
		PhanSo res = new PhanSo();
		res.mauso = mauso*a.mauso;
		res.tuso = tuso*a.mauso + a.tuso*mauso;
		res.rutGon();
		return res;
	}
	
	public PhanSo tru(PhanSo a){
		PhanSo res = new PhanSo();
		res.mauso = mauso*a.mauso;
		res.tuso = tuso*a.mauso - a.tuso*mauso;
		res.rutGon();
		return res;
	}
	
	public PhanSo nhan(PhanSo a){
		PhanSo res = new PhanSo();
		res.tuso = tuso*a.tuso;
		res.mauso = mauso*a.mauso;
		res.rutGon();
		return res;
	}
	
	public PhanSo chia(PhanSo a){
		return nhan(a.giaTriNghichDao());
	}
}
