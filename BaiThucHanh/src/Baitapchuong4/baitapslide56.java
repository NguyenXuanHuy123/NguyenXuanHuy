package Baitapchuong4;

import java.util.HashSet;
import java.util.Scanner;

public class baitapslide56 {

    public static void main(String[] args) {
        String name;
        HashSet<String> hashSetstring = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        hashSetstring.add("iphone");
        hashSetstring.add("ipad");
        hashSetstring.add("PC");
        hashSetstring.add("PS");

        System.err.println("Cac phan tu trong hashSetstring : ");
        System.out.println(hashSetstring);
        System.out.println("nhap phan tu can xoa : ");

        name = sc.nextLine();
        if(hashSetstring.contains(name)){
            hashSetstring.remove(name);
            System.out.println("xoa thanh cong");
            System.out.println("cac phan tu con lai la : ");
            System.out.println(hashSetstring);
        }else{
            System.out.println("xoa khong thanh cong");
        }
    }
}