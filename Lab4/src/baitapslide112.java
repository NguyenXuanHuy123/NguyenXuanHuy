import java.util.LinkedList;
import java.util.Scanner;

public class baitapslide112 {
    public static void main(String[] args) {
        LinkedList<Integer> trungbinhcong = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu : ");
        int n = sc.nextInt();
        for(int i = 0;i < n ; i++){
            System.out.println("nhap phan tu thu : " + i);
            int number = sc.nextInt();
            trungbinhcong.add(number);
        }
        System.out.println("day so vua nhap la : " + trungbinhcong);
        int sum = 0;
        int dem = 0;
        for(int i = 0;i < trungbinhcong.size();i++){
           if(trungbinhcong.get(i) % 2 ==0){
            sum = (sum + trungbinhcong.get(i));
            dem = dem +1;
           }
        }
        System.out.println("trung binh cong cua day so la : " + sum/dem);
        sc.close();
        }
    }
