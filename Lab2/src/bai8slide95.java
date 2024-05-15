import java.util.Scanner;

public class bai8slide95 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("so phan tu cua day so la : ");
         int n = sc.nextInt();
         int arr[] = new int[n];
         for(int i=0;i<n;i++){
            System.out.println("so thu : " + i);
            arr[i] = sc.nextInt();
         }
        double sum =0;
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
        }
        sum = sum/n;
        System.out.println("trung binh cong cua day so la : " + sum);
        sc.close();
    }
}
