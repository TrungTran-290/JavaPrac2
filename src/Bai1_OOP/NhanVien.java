package Bai1_OOP;

public class NhanVien extends CanBo{
    public NhanVien(String name, int tuoi, String gioitinh, String diachi) {
        super(name, tuoi, gioitinh, diachi);
    }

    public NhanVien() {
    }

    private String congviec;

    public String getCongviec() {
        return congviec;
    }

    public void setCongviec(String congviec) {
        this.congviec = congviec;
    }
}
