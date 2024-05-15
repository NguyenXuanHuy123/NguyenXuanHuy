import java.util.Scanner;

public class bai3slide93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten :");
        String name = sc.nextLine();
        System.out.println("nhap tuoi :");
        int n = sc.nextInt();
        if(n<16){
            System.out.println("Ban " +name+ " o do tuoi vi thanh nien");
        }else{if(n<18){
            System.out.println("ban " +name+ " o do tuoi truong thanh" );
        }else{
            System.out.println("ban " +name+ " da gia");
        }
        }
        sc.close();
    }
}