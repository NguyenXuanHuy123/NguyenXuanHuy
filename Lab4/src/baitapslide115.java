import java.util.HashMap;
import java.util.Scanner;

public class baitapslide115 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, student> danhSachSinhVien = new HashMap<>();

        System.out.println("Nhap so luong sinh vien : ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cho sinh vien thu  " + (i + 1) + ":"); 
            System.out.println("MSV: ");
            String maSV = sc.nextLine();
            System.out.println("Name: ");
            String hoTen = sc.nextLine();
            System.out.println("Class: ");
            String lop = sc.nextLine();
            danhSachSinhVien.put(maSV, new student(maSV, hoTen, lop));
        }

        System.out.println("Nhap ten class can tim : ");
        String lopCanTim = sc.nextLine();
        System.out.println("Sinh vien thuoc lop " + lopCanTim + ":");
        for (student sv : danhSachSinhVien.values()) {
            if (sv.getLop().equalsIgnoreCase(lopCanTim)) {
                System.out.println("MSV : " + sv.getMaSV() + ", Name : " + sv.getHoTen() + ", Class : " + sv.getLop());
            }
        }

        System.out.print("Nhap MSV can tim : ");
        String maSVCantim = sc.nextLine();
        student sinhVien = danhSachSinhVien.get(maSVCantim);
        if (sinhVien != null) {
            System.out.println("Sinh vien co MSV " + maSVCantim + ":");
            System.out.println("Name: " + sinhVien.getHoTen() + ", Class: " + sinhVien.getLop());
        } else {
            System.out.println("Khong tim thay " + maSVCantim);
        }

        sc.close();
    }
}
