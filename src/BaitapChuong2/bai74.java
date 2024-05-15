package BaitapChuong2;
import java.util.Scanner;

public class bai74 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
          do{
        System.out.println("nhap so phan tu mang : ");
         n = sc.nextInt();
        }while(n<0);
         int B[] = new int[n];    
         for(int i=0;i<n;i++){
         System.out.println("nhap phan tu thu " +i+ ":");
         B[i] = sc.nextInt();
         }
         double tong = 0;
         for(int i=0;i<n;i++){
            if(B[i] % 2 ==0)
            tong = tong + B[i];
         }
        System.out.println("gia tri cua mang la :" +tong);
        sc.close();
    }
}