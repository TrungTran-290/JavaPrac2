package DeThiKh;

import java.util.Scanner;

public abstract class KhachHang {
    protected String makh;
    protected String tenkh;
    protected int chisocu;
    protected int chisomoi;
    protected int sotien;

    public KhachHang(String makh, String tenkh, int chisocu, int chisomoi, int sotien) {
        this.makh = makh;
        this.tenkh = tenkh;
        this.chisocu = chisocu;
        this.chisomoi = chisomoi;
        this.sotien = sotien;
    }

    public KhachHang() {
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public int getChisocu() {
        return chisocu;
    }

    public void setChisocu(int chisocu) {
        this.chisocu = chisocu;
    }

    public int getChisomoi() {
        return chisomoi;
    }

    public void setChisomoi(int chisomoi) {
        this.chisomoi = chisomoi;
    }

    public int getSotien() {
        return sotien;
    }

    public void setSotien(int sotien) {
        this.sotien = sotien;
    }

    public long tinhKW(){
        return getChisomoi() - getChisocu();
    }

    public abstract long tinhtiendien();
    public abstract double tienthanhtoan();
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Ma Khach Hang");
        this.makh = scanner.nextLine();
        System.out.println("Nhap Ten Khach Hang");
        this.tenkh = scanner.nextLine();
        System.out.println("Nhap Chi So Cu");
        this.chisocu = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap Chi So Moi");
        this.chisomoi = scanner.nextInt();
//        System.out.println("Nhap So Tien");
//        this.sotien = scanner.nextInt();
    }
    public void xuat(){
        System.out.println("Ma Khach Hang: "+getMakh());
        System.out.println("Ten Khách Hàng: "+getTenkh());
        System.out.println("Chỉ Số Cũ: "+getChisocu()+" Chỉ Số Mới: "+getChisomoi() + " Số KW Tiêu Thụ: "+(getChisomoi()-getChisocu()));
        System.out.println("Số Tiền Điện: "+tinhtiendien());
        System.out.println("Tiền Thanh Toán: "+tienthanhtoan());
    }
}
