package Baitapchuong3.Baitapchuong3veclass;

import java.util.Scanner;

public class Hinhchunhat {
    public float chieudai;
    public float chieurong;
    public float chuvi;
    public float dientich;
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap chieu dai : ");
        chieudai = sc.nextFloat();
        System.out.println("nhap chieu rong : ");
        chieurong = sc.nextFloat();
        sc.close();
    }
    public void nhapdientich(){
        dientich = chieudai * chieurong;
    }
    public void nhapchuvi(){
        chuvi = (chieudai + chieurong) * 2;
    }
    public void In(){
        System.out.println("chu vi = " +chuvi);
        System.out.println("dien tich = " + dientich);
    }
}
