package DeThiKh2;



public class HoBT extends KhachHang {

    public HoBT(String makh, String tenkh, int chisocu, int chisomoi) {
        super(makh, tenkh, chisocu, chisomoi);
    }

    public HoBT() {
    }

    public int tiendien() {
        long bill ;
        if(tinhKW() < 51){
            bill = tinhKW() * 1500;
        }else if (tinhKW() < 101){
            bill = 50  * 1500  + (tinhKW()-50) * 2000;
        }else {
            bill = 50 * 1500  + 50 * 2000 + (tinhKW()*2800);
        }
        return (int) bill;
    }


    @Override
    public double tienthanhtoan() {
        return (tiendien() + tiendien()*0.1);
    }
}
