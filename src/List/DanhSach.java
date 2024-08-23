package List;

import Khach.KhachHang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSach {
    private static List<KhachHang> arr;

    public DanhSach() {
        arr = new ArrayList<>();
    }

    public void nhap(){
        int flag = 1;
        System.out.println("1: Tao");
        System.out.println("2: Xuat");
        System.out.println("3: Break");
        KhachHang a = null;
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Lua Chon Cua Ban?:");
            flag = scanner.nextInt();

            if (flag == 1) {
                a = new KhachHang();
                a.Nhap();
                arr.add(a);
            }
            else if (flag == 2) {
                for(KhachHang i: arr){
                    i.Xuat();
                }
            }
            else if (flag == 3) {
                break;
            }
        }
    }
    public long maxUSER(){
        long max = 0;
        for(KhachHang i: arr){
            if(max<i.tinhTien()){
                max = i.tinhTien();
            }
        }
        return max;
    }
}
