package BaitapChuong2;
import java.util.Scanner;

public class bai90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        char kytu;
        System.out.println("nhap chuoi : ");
        chuoi = sc.nextLine();
        System.err.println("cac ky tu co trong chuoi la : ");
        for(int i=0;i<chuoi.length();i++){
            kytu = chuoi.charAt(i);
            System.out.println(kytu);
        }
        sc.close();
    }
}
