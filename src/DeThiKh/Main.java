package DeThiKh;

public class Main {
    public static void main(String[] args) {
        DanhSachKhachHang danhSachKhachHang = new DanhSachKhachHang();
        danhSachKhachHang.nhap();
        danhSachKhachHang.xuat();
        System.out.println("Cau3 Tong Tien: "+danhSachKhachHang.cau3());
        danhSachKhachHang.cau4();
    }
}
