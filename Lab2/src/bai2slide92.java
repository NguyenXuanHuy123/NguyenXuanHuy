import java.util.Scanner;

public class bai2slide92 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a : ");
        double a = sc.nextDouble();
        if(a % 2 ==0){
            System.out.println("a la so chan");
        }else{
            System.out.println("a la so le");
        }
     sc.close();
    }
}
