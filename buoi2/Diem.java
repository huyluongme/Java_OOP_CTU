package buoi2;
import java.util.Scanner;

public class Diem {
	private int x;
	private int y;
	
	public Diem(){
		x = 0;
		y = 0;
	}
	
	public Diem(int x1, int y1){
		x = x1;
		y = y1;
	}
	
	public void nhapDiem(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap hoanh do x = ");
		x = sc.nextInt();
		System.out.print("Nhap tung do y = ");
		y = sc.nextInt();
	}
	
	public void hienThi(){
		System.out.println("(" + x + ", " + y + ")");
	}
	
	void doiDiem(int dx, int dy){
		x += dx;
		y += dy;
	}
	
	public int giatriX(){
		return x;
	}
	
	public int giatriY(){
		return y;
	}
	
	public float khoangCach(){
		return (float)Math.sqrt(Math.pow(x, 2) + Math.pow(y,2));
	}
	
	public float khoangCach(Diem d){
		return (float)Math.sqrt(Math.pow(x-d.x, 2) + Math.pow(y-d.y,2));
	}
}
