package CLB;

import java.util.Scanner;

public class Services {
    public long CoBan;
    public long LopHoc;
    public String Sauna;
    public long HoTroPT;

    public Services() {
    }


    public double getCoBan() {
        return CoBan;
    }

    public void setCoBan(long coBan) {
        CoBan = coBan;
    }

    public double getLopHoc() {
        return LopHoc;
    }

    public void setLopHoc(long lopHoc) {
        LopHoc = lopHoc;
    }

    public String getSauna() {
        return Sauna;
    }

    public void setSauna(String sauna) {
        Sauna = sauna;
    }

    public double getHoTroPT() {
        return HoTroPT;
    }

    public void setHoTroPT(long hoTroPT) {
        HoTroPT = hoTroPT;
    }

    public void xuat(){
        System.out.println("Phí Cơ Bản: " +
                this.getCoBan() +"\n" +
                "Chi Phí Lớp Học: " +
                this.getLopHoc() + "\n" +
                "Dịch Vụ Xông Hơi: "+
                this.getSauna() + "\n" +
                "Hỗ Trợ PT: " +
                this.getHoTroPT());
    }
    public Long tinhTien(){
        return this.CoBan+this.LopHoc+this.HoTroPT;
    }
}
