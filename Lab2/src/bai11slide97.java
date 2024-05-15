import java.util.Scanner;

public class bai11slide97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        do{
            System.out.println("so phan tu cua mang la : ");
            a = sc.nextInt();
        }while(a<=0);
        int Arr[]= new int[a];
        System.out.println("Nhap phan tu ");
        for(int i =0;i<a;i++){
            Arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<a-1;i++){
            for(int j=i+1;j<a;j++){
                if(Arr[i]>Arr[j]){
                    int trunggian = Arr[i];
                    Arr[i] = Arr[j];
                    Arr[j]= trunggian;
                }
            }
        }
        System.out.println("Sap xep theo thu tu tang dan la : ");
        for(int i=0;i<a;i++){
            System.out.print(Arr[i]+ " " );
        }
        sc.close();
    }
}
