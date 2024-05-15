package BaitapChuong2;
import java.util.Scanner;

public class bai81 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int m,n;
         System.out.println("nhap so cot :" );
         m = sc.nextInt();
         System.out.println("nhap so dong : ");
         n = sc.nextInt();
         int arr[][] = new int[m][n];
         System.out.println("nhap so phan tu trong mang : ");
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println("arr [" +i+ "] [" +j+ "] = ");
                arr[i][j] = sc.nextInt();
            }
         }
         int max = arr[0][0];
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(max < arr[i][j]){
                    max=arr[i][j];
            
    
            }
         }

    }
         System.out.println("phan tu co gia tri lon nhat trong ma tran la : " +max);
         sc.close();
}
}