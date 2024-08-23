package Khach;

import CLB.Basic;
import CLB.Non_member;
import CLB.Premium;
import CLB.Services;

import java.util.Scanner;

public class KhachHang {
    private String ten;
    private String CCCD;
    private int thang;
    private Services DV;

    public KhachHang() {
    }

    public KhachHang(String ten, String CCCD, int thang, Services DV) {
        this.ten = ten;
        this.CCCD = CCCD;
        this.thang = thang;
        this.DV = DV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public Services getDV() {
        return DV;
    }

    public void setDV(Services DV) {
        this.DV = DV;
    }

    public void Nhap(){
        System.out.println("Nhap Thông Tin: ");
        System.out.println("ten?");
        Scanner scanner =new Scanner(System.in);
        this.ten = scanner.nextLine();
        System.out.println("CCCD?");
        this.CCCD = scanner.nextLine();
        System.out.println("thang?");
        this.thang = scanner.nextInt();
        scanner.nextLine();
        System.out.println("DV?: \n" +
                "1: NON-MEMBER \n" +
                "2: Member \n" +
                "3:VIP");
        int i = scanner.nextInt();
        if (i==1){
            DV = new Non_member();
        } else if (i==2) {
            DV = new Basic();
        } else if (i==3) {
            DV = new Premium();
        }
    }
    public void Xuat(){
        System.out.println("Thong Tin Khach Hang"+"\n" +this.ten +"\n"+ this.thang+"\n" + this.CCCD +"\n");
        DV.xuat();
    }
    public Long tinhTien(){
        return DV.tinhTien()*thang;
    }
}
