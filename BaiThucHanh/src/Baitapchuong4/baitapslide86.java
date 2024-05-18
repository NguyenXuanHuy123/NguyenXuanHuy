package Baitapchuong4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class baitapslide86 {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("NXH","Nguyen Xuan Huy");
        hashMap.put("VVC"," Vu viet Cuong");
        
        Set<Map.Entry<String, String>> sethashmap = hashMap.entrySet();
        System.out.println("Cac entry co trong sethashmap :");
        System.out.println(sethashmap);
    }
}
