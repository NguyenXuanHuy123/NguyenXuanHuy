package BaitapChuong2;
import java.util.Scanner;

public class bai35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so1:");
        int so1 = sc.nextInt();
        System.out.println("nhap so2:");
        int so2 = sc.nextInt();
        if(so1<so2){
            System.out.println("so nho nhat la : " +so1);
        }else{
            System.out.println("so nho nhat la : " +so2);
            sc.close();
        }
    }
}

