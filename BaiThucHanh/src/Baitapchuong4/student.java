package Baitapchuong4;

import java.util.Scanner;

public class student {

    public String fullname;
    public int age;
    public void Nhapthongtin(){
     Scanner sc = new Scanner(System.in);
     System.out.println(" nhapten : ");
     fullname = sc.nextLine();
     System.out.println("nhaptuoi :");
     age = sc.nextInt();
    }
    public void Hienthithongtin(){
      System.out.println("ten : " +fullname);
      System.out.println("tuoi : " +age);
    }
    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
   

    
}