import java.util.Scanner;

public class bai1slide92 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a : ");
        double a = sc.nextDouble();
        System.out.println("nhap b : ");
        double b = sc.nextDouble();
        System.out.println("tong = " +(a+b));
        System.out.println("hieu = " +(a-b));
        System.out.println("thuong = " +(a/b));
        System.out.println("tich = " +(a*b));
        System.out.println("chia lay du = " +(a%b));
        if(a>b){
            System.out.println("a lon hon b");
        }else if(a==b){
            System.out.println("a bang b");
        }else{
            System.out.println("a nho hon b");
        }
        sc.close();
}
}