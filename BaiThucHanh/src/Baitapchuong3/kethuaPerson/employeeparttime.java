package Baitapchuong3.kethuaPerson;

import java.util.Scanner;

public class employeeparttime extends employee {
    public int giolamviec;

    public employeeparttime(){
        ten = "nhan vien part time";
        luong = 300000;
    }
    public void nhapgiolamviec(){
        super.nhapmnv();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so gio lam viec : ");
        giolamviec = sc.nextInt();
    }
    public void tinhluong(){
        luong = luong * giolamviec;
    }

    public void ingiolamviec(){
        super.inmvn();
        System.out.println("luong cua nhan vien parttime = " +  luong);
    }
}
