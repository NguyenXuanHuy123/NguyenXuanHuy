package Baitapchuong4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class baitapslide88 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("HP", "Hai Phong");
        hashMap.put("HN", "Ha Noi");
        hashMap.put("QN", "Quang Ninh");
        System.out.println("Cac thanh pho trong hashMap");
        Set<Map.Entry<String,String>> HashMapCity = hashMap.entrySet();
        System.out.println(HashMapCity);
        System.out.println("HN " +hashMap.get("HN"));
        System.out.println("HP" +hashMap.get("HP"));
        if (hashMap.containsValue("Quang Ninh")) {
            System.out.println("Co Quang Ninh trong HashMapCity");
        }
    }
}
