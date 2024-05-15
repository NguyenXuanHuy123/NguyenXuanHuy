package Baitapchuong3.Baitapchuong3veclass;
import java.util.Scanner;

public class Student {
    public String fullname;
    public int age;
    public long msv;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ho ten : ");
        fullname = sc.nextLine();
        System.out.print("nhap tuoi : ");
        age = sc.nextInt();
        System.out.print("nhap ma sinh vien : ");
        msv = sc.nextLong();
        sc.close();
    }
    public void in(){
        System.out.println("ho va ten :" + fullname);
        System.out.println("tuoi :" +age);
        System.out.println("ma sinh vien : " +msv);
    }
}
