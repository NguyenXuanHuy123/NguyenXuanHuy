package Baitapchuong3.KethuaHinhhoc;

import java.util.Scanner;

public class Hinhchunhat extends Hinhhoc {
    public float chieudai;
    public float chieurong;

    public Hinhchunhat(){
        ten = "Hinhchunhat";
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("chieu dai = " );
        chieudai = sc.nextFloat();
        System.out.println("chieu rong = ");
        chieurong = sc.nextFloat();
        sc.close();
    }
    public void tinhchuvi(){
        chuvi = (chieudai + chieurong)*2;
    }
    public void tinhdientich(){
        dientich = chieudai * chieurong;
    }
}
