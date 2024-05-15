import java.util.Scanner;

public class bai5slide94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        do{
        System.out.println("nhap n :");
        n = sc.nextInt();
        sum = sum + n;
        }while(sum<100);
        System.out.println("tong cac so nguyen = " +sum);
        sc.close();
    }
}
