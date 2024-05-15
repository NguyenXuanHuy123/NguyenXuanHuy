package Baitapchuong4;

import java.util.LinkedList;

public class LinkedlistDemo {
    public static void main(String[] args) {
        LinkedList<student> linkerliststudent = new LinkedList<student>();
        for(int i = 0; i<2 ;i++){
            student st = new student();
            st.Nhapthongtin();
            linkerliststudent.add(st);
        }
        for(int i = 0; i < linkerliststudent.size();i++){
            linkerliststudent.get(i).Hienthithongtin();
        }
    }
}
