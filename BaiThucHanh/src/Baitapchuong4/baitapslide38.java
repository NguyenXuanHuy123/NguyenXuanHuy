package Baitapchuong4;

import java.util.LinkedList;

public class baitapslide38 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("java");
        list.add("C++");
        list.add("python");;
        list.add("PHP");
        System.out.println("Vi du ve addALL()");
        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.println("listA : ");
        System.out.println(listA);
        
        System.out.println("Vi du su dung phuong thuc retainALL()");
        LinkedList<String> listB = new LinkedList<String>();
        listB.add("java");
        listA.retainAll(listB);
        System.out.println("ListA");
        System.out.println(listA);

        System.out.println("Vi du ve phuong thuc removeALL()");
        list.removeAll(listB);
        System.out.println("list : ");
        System.out.println(list);
    }
    public static void show (LinkedList<String> list){
        for(String obj : list){
            System.out.println("/t" +obj + ", ");
        }
        System.out.println();
    }
}
