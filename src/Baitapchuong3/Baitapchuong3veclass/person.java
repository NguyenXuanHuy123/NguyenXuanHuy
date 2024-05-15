package Baitapchuong3.Baitapchuong3veclass;

public class person {
    public String Hoten;
    public String gioitinh;
    public String cccd;
    public int tuoi;
    public person(){
        Hoten = "Nguyen Xuan Huy";
        gioitinh = "nam";
        cccd = "001204005829";
        tuoi = 20;
    }
    public void In(){
        System.out.println(Hoten+" gioi tinh- "+gioitinh+" cccd- "+cccd+" tuoi- "+tuoi);
    }
    public void In(String Hoten,String gioitinh,String cccd,int tuoi){
        System.out.println(Hoten+" gioi tinh- "+gioitinh+" cccd- "+cccd+" tuoi- "+tuoi);
    }
}
