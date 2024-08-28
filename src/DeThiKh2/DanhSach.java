package DeThiKh2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSach {
    List<KhachHang> list;

    public DanhSach() {
        list = new ArrayList<>();

    }
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So Luong: ");
        int sl = scanner.nextInt();
        for (int o =0 ; o <sl ;o++){
            System.out.println("Cho Kinh Doanh");
            System.out.println("1 : Kinh Doanh");
            System.out.println("2 : Binh Thuong");
            int i = scanner.nextInt();
            switch (i) {
                case 1 -> {
                    KhachHang kh = new HoKD();
                    kh.nhap();
                    list.add(kh);
                }
                case 2 -> {
                    KhachHang kh = new HoBT();
                    kh.nhap();
                    list.add(kh);
                }
            }
        }
    }
    public void xuat(){
        list.forEach(KhachHang::xuat);
    }
    public void cau3(){
        double tong = list.stream().mapToDouble(KhachHang::tienthanhtoan).sum();
        System.out.println(""+tong);
    }
    public double tinhmax(){
        double maxC = 0;
        for (KhachHang i: list){
            if(i instanceof HoKD){
                if(i.tienthanhtoan() >= maxC){
                    maxC = i.tienthanhtoan();
                }
            }
        }
        return maxC;
    }
    public void cau4(){
        list.stream()
                .filter(khachHang -> khachHang.tienthanhtoan() ==tinhmax())
//                .forEach(KhachHang::xuat);
                .forEach(khachHang -> System.out.println(khachHang.tenkh));
    }
}
