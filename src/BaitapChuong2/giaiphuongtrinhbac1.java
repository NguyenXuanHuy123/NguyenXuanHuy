package BaitapChuong2;
import java.util.Scanner;

public class giaiphuongtrinhbac1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("nhap a:");
         Double a = sc.nextDouble();
         System.out.println("nhap b:");
         Double b = sc.nextDouble();
         Double x;
         System.out.println("Phuong trinh nhap vao la : " +a +"x" + b + "= 0");
         if (a==0){
            if(b==0){
                System.out.println("Phuong trinh vo so nghiem");
                }else{
                System.out.println("phuong trinh vo nghiem");
            }
                }else{
            x = -b/a;
            System.out.println("phuong trinh co nghiem la x =" + x);
         }
    sc.close();

     }
}
