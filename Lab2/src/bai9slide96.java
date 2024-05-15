import java.util.Scanner;

public class bai9slide96 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao chuoi : ");
         String chuoi = sc.nextLine();
         char kytu;
         int chuhoa = 0 ;
         int chuthuong = 0;
         int so = 0;
         for(int i=0;i<chuoi.length();i++){
            kytu = chuoi.charAt(i);
        if(Character.isLowerCase(kytu)){
            chuthuong++;
        }
        if(Character.isUpperCase(kytu)){
            chuhoa++;
        }
        if(Character.isDigit(kytu)){
            so++;
        }
        }
        System.out.println("so ky tu hoa la : " + chuhoa);
        System.out.println("so ky tu thuong la : " + chuthuong);
        System.out.println("so : " + so);
        sc.close();
        
    }
}
