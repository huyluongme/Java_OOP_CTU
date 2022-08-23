import java.util.Scanner;

public class TachTen {
    public static String layTen(String hoten){
        String tmp = hoten;
        tmp = tmp.trim();
        int p = tmp.lastIndexOf(" ");
        tmp = tmp.substring(p+1);
        return tmp;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String hoten = new String();
        hoten = sc.nextLine();
        String ten = layTen(hoten);
        System.out.println(ten);
    }
}
