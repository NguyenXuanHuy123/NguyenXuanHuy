package Baitapchuong4;

import java.util.Scanner;
import java.util.TreeSet;

public class baitapslide69 {
    public static void main(String[] args) {
        int number;
        TreeSet<Integer> TreeSet = new TreeSet<>();
        TreeSet.add(1);
        TreeSet.add(90);
        TreeSet.add(1000);
        TreeSet.add(1111);
        Scanner sc = new Scanner(System.in);
        System.out.println("cac phan tu trong treeset : ");
        System.out.println(TreeSet);
        System.out.println("Nhap phan tu muon them : ");
        number = sc.nextInt();
        if(TreeSet.contains(number)){
            System.out.println("so " + number + "da ton tai");
        }else{
            TreeSet.add(number);
            System.out.println("them so thanh cong ");
            System.out.println("cac phan tu trong TreeSet");
            System.out.println(TreeSet);
        }

    }
}
