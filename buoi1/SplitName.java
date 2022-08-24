package buoi1;

import java.util.Scanner; 

public class SplitName {

	public static String split(String s) {
		String name = s;
		name = name.trim();
		int p = name.lastIndexOf(" ");
		name = name.substring(p + 1);
		return name;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ho ten: ");
		String s = sc.nextLine();
		String name = split(s);
		System.out.println("Ten: " + name);
	}

}
