import java.util.Scanner;

public class bai6slide95 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n;
         do{
            System.out.println("nhap so nguyen duong : ");
            n = sc.nextInt();
         }while(n<=0);
         long giaithua = 1;
         for(int i=n;i>1;i--){
           giaithua = giaithua*i;
         }
         System.out.println("giai thua = " +giaithua);
         sc.close();
    }
}