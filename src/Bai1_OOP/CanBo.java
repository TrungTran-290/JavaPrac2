package Bai1_OOP;

import java.util.Scanner;

public class CanBo {
    protected String name;
    protected int tuoi;
    protected String gioitinh;
    protected String diachi;

    public CanBo(String name, int tuoi, String gioitinh, String diachi) {
        this.name = name;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
    }

    public CanBo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Ten cua Can Bo");
        name=scanner.nextLine();
        System.out.println("Nhap Tuoi cua Can Bo");
        tuoi=scanner.nextInt();
        System.out.println("Nhap Gioi Tinh cua Can Bo");
        scanner.nextLine();
        gioitinh=scanner.nextLine();
        System.out.println("Nhap Dia Chi cua Can Bo");
        diachi=scanner.nextLine();
    }
    public void xuat(){
        System.out.println("Ten cua Can Bo: "+getName());
        System.out.println("Tuoi cua Can Bo: "+getTuoi());
        System.out.println("Gioi Tinh cua Can Bo: "+getGioitinh());
        System.out.println("Dia Chi cua Can Bo: "+getDiachi());
    }
}
