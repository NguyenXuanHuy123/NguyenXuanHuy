package Baitapchuong4;

import java.util.ArrayList;
import java.util.Scanner;

public class baitapslide23 {
public class Max {
    public static void main(String[] args) {
        ArrayList<Integer> ArrayListInteger = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        int number; 

        System.out.println("Nhap so phan tu cua ArrayList: ");
        int n = sc.nextInt();
       for(int i = 0; i < n; i++){
        System.out.println("Nhap phan tu thu " + i + ": ");
        number = sc.nextInt();
        ArrayListInteger.add(number);
       }
          int max = ArrayListInteger.get(0);
          for(int i=1; i < ArrayListInteger.size(); i++){
            if(ArrayListInteger.get(i).compareTo(max) > 0){
                max = ArrayListInteger.get(i);
            }
          }
        System.out.println("Phan tu lon nhat trong ArrayListInteger = " + max);
    }

}
}
