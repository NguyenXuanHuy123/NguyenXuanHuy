import java.util.Scanner;

public class bai10slide96 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        do{
            System.out.println("nhap chuoi duoi 80 ky tu : ");
            chuoi = sc.nextLine();
        }while(chuoi.length()>80);
        System.out.println("nhap ky tu can tim : ");
        char kytu = sc.next().charAt(0);
         int lap = 0;
         for(int i=0;i<chuoi.length();i++){
            if(kytu==chuoi.charAt(i)){
                lap++;
            }
         }
         System.out.println("so lan xuat hien cua " + kytu + " la " + lap);
         sc.close();

    }
}
