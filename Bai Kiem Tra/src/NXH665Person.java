
import java.util.Scanner;

public class NXH665Person {
    public static void main(String[] args) {
    }
    String name;
    int age;
    Long ID;
    public void Nhap(){
    Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten : ");
        name = sc.nextLine();
        System.out.println("nhap tuoi :" );
        age = sc.nextInt();
        System.out.println("nhap ID ");
        ID = sc.nextLong();
    }
    public void Xuat(){
        System.out.println("Ho va ten la :" + name);
        System.out.println("tuoi : " + age);
        System.out.println("So ID " + ID);
    }

    
    
}
