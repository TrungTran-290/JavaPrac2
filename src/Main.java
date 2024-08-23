import Khach.KhachHang;
import List.DanhSach;

public class Main {
    public static void main(String[] args) {
//        Non_member nonMember = new Non_member();
//        Basic basic= new Basic();
//        Premium premium = new Premium();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Non-member(Phi Co Ban): "+nonMember.getCoBan());


//        Services services = new Services();
//        services.nhap();
//        KhachHang khachHang = new KhachHang();
//        khachHang.Nhap();
        DanhSach danhSach = new DanhSach();
        danhSach.nhap();
        System.out.println("Max: "+danhSach.maxUSER());
//        System.out.println("Tien: "+khachHang.tinhTien());
    }
}