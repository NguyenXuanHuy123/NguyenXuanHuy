import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class baitapslide114 {
        public static void main(String[] args) {
        HashSet<String> fruitsHashSet = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten cac loai trai cay (bam ok de dung):");
        String fruitName = sc.nextLine();
        while (!fruitName.equals("ok")) {
            fruitsHashSet.add(fruitName);
            fruitName = sc.nextLine();
        }

        System.out.println("So luong phan tu trong HashSet: " + fruitsHashSet.size());

        System.out.println("Nhap ten loai trai cay can kiem tra va xoa:");
        String checkFruit = sc.nextLine();
        if (fruitsHashSet.contains(checkFruit)) {
            System.out.println("Da tim thay " + checkFruit + " trong HashSet.");
            fruitsHashSet.remove(checkFruit);
        } else {
            System.out.println("Khong tim thay " + checkFruit + " trong HashSet.");
        }

        System.out.println("Cac phan tu con lai trong HashSet sau khi xoa:");
        for (String fruit : fruitsHashSet) {
            System.out.println(fruit);
        }

        List<String> newList = new ArrayList<>();
        newList.add("Tao");
        newList.add("Oi");
        newList.add("Dua Hau");
        fruitsHashSet.addAll(newList);

        System.out.println("Cac phan tu trong HashSet sau khi them tu List:");
        for (String fruit : fruitsHashSet) {
            System.out.println(fruit);
        }

        fruitsHashSet.removeAll(newList);

        System.out.println("Cac phan tu trong HashSet sau khi xoa tu List:");
        for (String fruit : fruitsHashSet) {
            System.out.println(fruit);
            sc.close();
        }
    }
}
