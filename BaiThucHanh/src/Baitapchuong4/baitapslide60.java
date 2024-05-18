package Baitapchuong4;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class baitapslide60 {
    public static void main(String[] args) {
        Set<String> LinkedHashSet = new LinkedHashSet<String>();
        LinkedHashSet.add("Huy");
        LinkedHashSet.add("Hoang");
        LinkedHashSet.add("MY");
        LinkedHashSet.add("Tai");
        LinkedHashSet.add("Cuong");

        System.out.println("Cac phan tu trong LinkedHashSet : ");
        for(String str : LinkedHashSet){
            System.out.println(str);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phan tu can xoa : ");
        String s = sc.nextLine();
        if(LinkedHashSet.contains(s)){
            LinkedHashSet.remove(s);
            System.out.println("Xoa thanh cong : ");
            System.out.println("cac phan tu con lai la : ");
            System.out.println(LinkedHashSet);
        }else{
            System.out.println("xoa khong thanh cong");
        }
    }
}
