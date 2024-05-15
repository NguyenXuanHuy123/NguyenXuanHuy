package BaitapChuong2;
import java.util.Scanner;

public class bai30 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("nhap n:");
     int n = sc.nextInt();
     int sum = 0;
     int du;
     while (n>0) {
        du = n % 10;
        n = n / 10;
        sum = sum + du;
     }
     System.out.println("tong = " +sum);
     sc.close();
    }
}