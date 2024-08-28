package DeThiKh2;

import java.util.Scanner;

public abstract class KhachHang {
    protected String makh;
    protected String tenkh;
    protected int chisocu;
    protected int chisomoi;

    public KhachHang(String makh, String tenkh, int chisocu, int chisomoi) {
        this.makh = makh;
        this.tenkh = tenkh;
        this.chisocu = chisocu;
        this.chisomoi = chisomoi;
    }

    public KhachHang() {
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ma Kh");
        makh = scanner.nextLine();
        System.out.println("Ten");
        tenkh = scanner.nextLine();
        System.out.println("Chi SO Cu");
        chisocu = scanner.nextInt();
        System.out.println("Chi So Moi");
        chisomoi = scanner.nextInt();
    }
    public int tinhKW(){
        return this.chisomoi - this.chisocu;
    }
    public abstract int tiendien();
    public abstract double tienthanhtoan();
    public void xuat(){
        System.out.println("Makh: "+makh);
        System.out.println("Makh: "+tenkh);
        System.out.println("Makh: "+chisocu);
        System.out.println("Makh: "+chisomoi);
        System.out.println("KW TIEU THU"+ tinhKW());
        System.out.println("Tien Dien: "+tiendien());
        System.out.println("Thanh Toan: "+tienthanhtoan());
    }

}
