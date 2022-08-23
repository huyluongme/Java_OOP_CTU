import java.util.Scanner;

public class DanhSach {
    int arr[];
    int n, x;
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        x = sc.nextInt();
    }

    public void xuat(){
        for(int e : arr){
            System.out.print(e + " ");
        }
    }

    public void timkiem(int x){
        int cnt = 0;
        for(int e : arr){
            if(e == x) cnt++;
        }
        System.out.println(cnt);
    }

    public void sapxep(){
        for(int i = 0; i < n - 1; i++){
            for(int j =  n - 1; j > i; --j){
                if(arr[j] < arr[j - 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args){
        DanhSach ds = new DanhSach();
        ds.nhap();
        ds.sapxep();
        ds.timkiem(ds.x);
        ds.xuat();
    }
}
