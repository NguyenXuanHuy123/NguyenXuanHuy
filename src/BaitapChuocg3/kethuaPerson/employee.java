package BaitapChuocg3.kethuaPerson;

import java.util.Scanner;

public class employee extends person {
    public String mnv;
    public long luong;
    public void nhapmnv(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma nhan vien : ");
        mnv = sc.nextLine();
    }
    public void inmvn(){
        super.In();
        System.out.println("ma nhan vien la: " + mnv);
    }
}
