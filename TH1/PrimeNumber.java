import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        boolean flag = false;
        n = sc.nextInt();
        if(n == 0 || n == 1){
            System.out.println("n không là số nguyên tố");
        }else{
            for(int i = 2; i < n; i++){
                if(n % i == 0){
                    System.out.println("n không là số nguyên tố");
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println("n là số nguyên tố");
            }
        }
        System.out.println(Integer.toBinaryString(n));
    }
}
