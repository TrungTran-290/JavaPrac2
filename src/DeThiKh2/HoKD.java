package DeThiKh2;


public class HoKD extends KhachHang {
    public String linhvuckinhdoanh;

    public String getLinhvuckinhdoanh() {
        return linhvuckinhdoanh;
    }

    public HoKD() {
    }

    public void setLinhvuckinhdoanh(String linhvuckinhdoanh) {
        this.linhvuckinhdoanh = linhvuckinhdoanh;
    }

    public HoKD(String linhvuckinhdoanh) {
        this.linhvuckinhdoanh = linhvuckinhdoanh;
    }

    public int tiendien() {
        return tinhKW()*3000;
    }

    @Override
    public double tienthanhtoan() {
        if(linhvuckinhdoanh == "cong ty nha nuoc"){
            return (tiendien() + tiendien()*0.1 + tiendien() *0.05);
        }
        return (tiendien() + tiendien()*0.1);
    }
}
