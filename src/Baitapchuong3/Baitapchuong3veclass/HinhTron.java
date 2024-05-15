package Baitapchuong3.Baitapchuong3veclass;
import java.util.Scanner;

public class HinhTron {
    final float Pi = 3.14f;
    public float BanKinh;
    public float ChuVi;
    public float DienTich;
    public void nhapBanKinh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap R = ");
        BanKinh = sc.nextFloat();
        sc.close();
    }
    public void nhapChuvi(){
        ChuVi = 2 * Pi * BanKinh;
    }
    public void nhapDienTich(){
        DienTich = Pi * BanKinh * BanKinh;
    }
    public void inramanhinh(){
        System.out.println("\nChu vi hinh tron la : " + ChuVi);
        System.out.println("\nDien tich hinh tron la : " + DienTich);
    }
}
