package Baitapchuong3.kethuaPerson;

import java.util.Scanner;

public class employeefulltime extends employee {
    public int ngaycong;

    public employeefulltime(){
        ten = "nhan vien fulltime";
        luong = 800000;
    }

    public void nhapngaycong(){
        super.nhapmnv();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ngay cong : ");
        ngaycong = sc.nextInt();
    }
    public void tinhluong(){
        luong = luong *ngaycong;
    }
    public void inngaycong(){
        super.inmvn();
        System.out.println("Luong cua nhan vien fulltime : " + luong);
    }
    
}
