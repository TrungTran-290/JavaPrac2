package Bai1_OOP;

import java.util.Scanner;

public class CongNhan extends CanBo{
    private int rank;

//    public CongNhan(String name, int tuoi, String gioitinh, String diachi) {
//        super(name, tuoi, gioitinh, diachi);
//    }

    public CongNhan() {

    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhap Cap Bac cua Cong Nhan");
        Scanner scanner = new Scanner(System.in);
        rank = scanner.nextInt();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Cap Bac La: "+getRank());
    }
}
