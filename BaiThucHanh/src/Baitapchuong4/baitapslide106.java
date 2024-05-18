package Baitapchuong4;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class baitapslide106 {
    public static void main(String[] args) {
        TreeMap<Integer,Character> treeMap = new TreeMap<Integer,Character>();
        treeMap.put(01,'A');
        treeMap.put(02, 'B');
        treeMap.put(03, 'C');

        Set<Map.Entry<Integer,Character>> settreemap = treeMap.entrySet();
        System.out.println("Cac entry cua treeMap");
        System.out.println(settreemap);

    }
}
