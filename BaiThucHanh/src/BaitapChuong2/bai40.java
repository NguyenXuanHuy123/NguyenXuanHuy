package BaitapChuong2;
import java.util.Scanner;

public class bai40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap day: ");
        int day = sc.nextInt();
        switch (day) {
            case 1:System.out.println("thu hai");
                break;
            case 2:System.out.println("thu ba");
                break;
            case 3:System.out.println("thu tu");
                break;
            case 4:System.out.println("thu nam");
                break;
            case 5:System.out.println("thu sau");
                break;
            case 6:System.out.println("thu bay");
                break;
            case 7:System.out.println("chu nhat");
            default:System.out.println("so ngay trong tuan khong dung");
            sc.close();
                break;
        }
    }
}
