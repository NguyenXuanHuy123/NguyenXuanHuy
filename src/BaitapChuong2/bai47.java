package BaitapChuong2;
import java.util.Scanner;

public class bai47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n;
         int tong = 0;
         do{
            System.out.println("nhap n: ");
            n = sc.nextInt();
            tong = tong + n;
         }while(tong<100);
         System.out.println("tong cua cac so nguyen = " +tong);
         sc.close();
    }
}

