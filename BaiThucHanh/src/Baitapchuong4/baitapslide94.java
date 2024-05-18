package Baitapchuong4;

import java.util.LinkedHashMap;
import java.util.Map;

public class baitapslide94 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
        hm.put(14,"Nguyen");
        hm.put(9,"Xuan");
        hm.put(2004, "Huy");

        for(Map.Entry<Integer,String> h:hm.entrySet()){
        System.out.println(h.getKey()+" "+h.getValue());
        System.out.println("Truoc khi loai bo : " +hm);
        hm.remove(14);
        System.out.println("sau khi loai bo : " +hm);
    }
    }
}
