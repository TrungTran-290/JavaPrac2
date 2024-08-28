package DeThiKh;

import java.util.Scanner;

public class HoKinhDoanh extends KhachHang{
    public HoKinhDoanh() {
    }
    private String linhvuckinhdoanh;

    public String getLinhvuckinhdoanh() {
        return linhvuckinhdoanh;
    }

    public HoKinhDoanh(String makh, String tenkh, int chisocu, int chisomoi, int sotien, String linhvuckinhdoanh) {
        super(makh, tenkh, chisocu, chisomoi, sotien);
        this.linhvuckinhdoanh = linhvuckinhdoanh;
    }

    public void setLinhvuckinhdoanh(String linhvuckinhdoanh) {
        this.linhvuckinhdoanh = linhvuckinhdoanh;
    }

    public int chisotieuthu(){
        return getChisomoi() - getChisocu();
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhập Lĩnh Vực Kinh Doanh");
        Scanner scanner = new Scanner(System.in);
        this.linhvuckinhdoanh = scanner.nextLine();
    }

    @Override
    public long tinhtiendien() {
        return chisotieuthu() * 3000L;
    }

    @Override
    public double tienthanhtoan() {
        if (linhvuckinhdoanh!=("công ty nhà nuoc")){
            return (tinhtiendien() + tinhtiendien()*0.1 - tinhtiendien()*0.05);
        }
        else {
            return (tinhtiendien() + tinhtiendien()*0.1);
        }
    }
}
