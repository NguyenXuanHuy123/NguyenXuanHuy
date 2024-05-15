package Baitapchuong4;

import java.util.ArrayList;

public class arraylistDemo {

     public static void main(String[] args) {
        ArrayList<student> arrayListStudent = new ArrayList<student>();
        for (int i = 0 ;i<3;i++){
            student st = new student();
            st.Nhapthongtin();
            arrayListStudent.add(st);
        }
        for(int i = 0 ; i < arrayListStudent.size();i++){
            arrayListStudent.get(i).Hienthithongtin();
        }
     }
    
}