package BaitapChuocg3.kethuaPerson;

import java.util.Scanner;

public class person {
    public String ten;
    public String gioitinh;
    public int tuoi;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten : ");
        ten = sc.nextLine();
        System.out.print("nhap gioi tinh : ");
        gioitinh = sc.nextLine();
        System.out.print("nhap tuoi : ");
        tuoi = sc.nextInt();
    }
    public void In(){
        System.out.println("ho va ten : " +ten);
        System.out.println("gioi tinh : " +gioitinh);
        System.out.println("tuoi : " +tuoi);
    }
}
