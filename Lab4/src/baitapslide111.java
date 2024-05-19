import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class baitapslide111 {
    public static void main(String[] args) {
        ArrayList <Integer> songuyen = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu : ");
        int n = sc.nextInt();
        for (int i = 0 ; i < n ;i++){
        System.out.println("Nhap vao phan tu thu " + i );
        int number = sc.nextInt();
        songuyen.add(number);
        }
        System.out.println(songuyen);
        int max = songuyen.get(0);
        System.out.println("ban muon xoa : ");
        int delete = sc.nextInt();
        ArrayList<Integer> xoa = new ArrayList<>();
        xoa.add(delete);
        songuyen.removeAll(xoa);
        System.out.println("sau khi xoa : ");
        System.out.println(songuyen);
        for(int i = 0; i<songuyen.size();i++){
            if (max<songuyen.get(i)) {
                max = songuyen.get(i);
            }
        }
        System.out.println("so nguyen lon nhat la : " + max);
        Collections.sort(songuyen);
        System.out.println("day so sau khi sap xep la : ");
        System.out.println(songuyen);
        sc.close();
    }
}
