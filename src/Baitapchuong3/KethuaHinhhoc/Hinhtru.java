package Baitapchuong3.KethuaHinhhoc;

import java.util.Scanner;

public class Hinhtru extends Hinhtron {
    public float chieucao;

    public Hinhtru(){
        ten = "Hinhtru";
    }

    public void nhapchieucao(){
        super.nhapbk();
        Scanner sc = new Scanner(System.in);
        System.out.println("chieu cao = ");
        chieucao = sc.nextFloat();
        sc.close();
    }
    public void tinhthetich(){
        thetich = Pi * Bk * Bk * chieucao;
    }
}
