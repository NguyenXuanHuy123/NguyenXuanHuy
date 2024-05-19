package bai3;

public class SinhVien {
        public String hoten;
        public float diem;
        public SinhVien(String hoten,float diem){
            this.hoten=hoten;
            this.diem=diem;
        }
        public String toString(){
            return "Ho ten : "+hoten+", Diem :  "+diem;
        }
    }
