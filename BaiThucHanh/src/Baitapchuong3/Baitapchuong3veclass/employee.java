package Baitapchuong3.Baitapchuong3veclass;
import java.util.Scanner;

public class employee {
    public String ten;
    public String nghenghiep;
    public String chucvu;
    public double luongtheongay;
    public double luong;
    public int songaycong;
    public int age;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten :");
        ten = sc.nextLine();
        System.out.print("nghe nghiep :");
        nghenghiep = sc.nextLine();
        System.out.print("chuc vu :");
        chucvu = sc.nextLine();
        System.out.print("tuoi :");
        age = sc.nextInt();
        System.out.print("nhap luong mot ngay :");
        luongtheongay = sc.nextDouble();
        System.out.print("so ngay lam viec :");
        songaycong = sc.nextInt();
        sc.close();
    }
    public double nhapluong(){
        luong = luongtheongay * songaycong;
        return luong;
    }
    public void In(){
        System.out.println("ho va ten : " + ten);
        System.out.println("nghe nghiep : " + nghenghiep);
        System.out.println("chu vu : " + chucvu);
        System.out.println(" tuoi : " + age);
        System.out.println("luong thang : " + luong);

    }

}
