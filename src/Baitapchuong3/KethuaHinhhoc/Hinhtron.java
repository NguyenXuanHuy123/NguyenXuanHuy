package Baitapchuong3.KethuaHinhhoc;

import java.util.Scanner;

public class Hinhtron extends Hinhhoc {
    public float Bk;
    
    public Hinhtron(){
        ten = "Hinh tron";
    }
    public void nhapbk(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ban kinh = ");
        Bk = sc.nextFloat();
    }
    public void tinhchuvi(){
        chuvi = 2*Pi *Bk;
    }
    public void tinhdientich(){
        dientich = Pi *Bk*Bk;
    }
}
