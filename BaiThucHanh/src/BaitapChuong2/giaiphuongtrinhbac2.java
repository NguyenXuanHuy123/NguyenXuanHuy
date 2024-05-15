package BaitapChuong2;
import java.util.Scanner;

public class giaiphuongtrinhbac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a:");
        Double a = sc.nextDouble();
        System.out.println("nhap b:");
        Double b = sc.nextDouble();
        System.out.println("nhap c:");
        Double c = sc.nextDouble();
        Double dental;
        if (a==0) {
            if(b==0){
                System.out.println("phuong trinh vo nghiem");       
        }else{
            System.out.println("phuong trinh co mot nghiem x =" + (-c/b));
            sc.close();
        } return;}
         dental = b*b -4*(a*c);
        if(dental<0){
         System.out.println("phuong trinh vo nghiem");
         }else{
            if(dental==0){
                System.out.println("phuong trinh co nghiem kep x1=x2= " +(-b/2*a));
            }else{
             System.out.println("phuong trinh co nghiem x1= " +(-b +Math.sqrt(dental)/2*a));
             System.out.println("phuong trinh co nghiem x2= " +(-b -Math.sqrt(dental)/2*a));
            }
            sc.close();
         }
         }


    }
