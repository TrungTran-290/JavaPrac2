package DeThiKh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachKhachHang {
    List<KhachHang> list;

    public DanhSachKhachHang() {
        list = new ArrayList<>();
    }

    public void nhap() {
        System.out.println("nhap so khach hang");
        Scanner scanner = new Scanner(System.in);
        int sl = scanner.nextInt();
        for (int i = 0; i < sl; i++) {
            System.out.println("Nhap Loai Khach Hang");
            System.out.println("1: KinhDoanh");
            System.out.println("2: BinhThuong");
            int loai = scanner.nextInt();
            if (loai == 1) {
                KhachHang kh = new HoKinhDoanh();
                kh.nhap();
                list.add(kh);
            } else if (loai == 2) {
                KhachHang kh = new HoBinhThuong();
                kh.nhap();
                list.add(kh);
            }
        }
    }

    //    public void xuat(){
//        for (KhachHang i : list){
//            i.xuat();
//        }
//    }
    public void xuat() {
        list.forEach(KhachHang::xuat);
    }

    public double cau3() {
        return list.stream()
                .mapToDouble(kh -> kh.tinhtiendien())
                .sum();
    }

    public double dienlonnhat() {

        return list.stream()
                .filter(khachHang -> khachHang instanceof HoKinhDoanh)
                .mapToDouble(kh -> kh.tinhtiendien())
                .max()
                .orElse(0);
    }

    public void cau4() {
        System.out.println("SO lon nhat");
        if (dienlonnhat() != 0) {
            list.stream()
                    .filter(khachHang -> khachHang.tinhtiendien() == dienlonnhat() && khachHang instanceof HoKinhDoanh)
                    .forEach(khachHang -> {
                        System.out.println("Ten Khach Hang: " + khachHang.tenkh);
                        System.out.println("Tong So Dien Su Dung: " + khachHang.tinhKW());
                    });
        }
    }
}
