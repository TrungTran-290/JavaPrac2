package CLB;

public class Basic extends Services {
    private int soLop;

    public Basic() {
//        super(1000,0,"None",0);
        this.CoBan = 1000;
        this.LopHoc = 100;
        this.Sauna = "None";
        this.HoTroPT = 0;
        this.soLop = soLop;
    }

    public int getSoLop() {
        return soLop;
    }

    public void setSoLop(int soLop) {
        this.soLop = soLop;
    }

    @Override
    public Long tinhTien() {
        return CoBan+LopHoc*soLop+HoTroPT;
    }
}
