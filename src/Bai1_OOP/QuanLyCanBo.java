package Bai1_OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuanLyCanBo {
    List<CanBo> list;
    public QuanLyCanBo(){
        list = new ArrayList<>();
    }
    public void them(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("so luong nhan vien");
        int soluong = scanner.nextInt();
        for (int i=0;i<soluong;i++){
            System.out.println("Nhap Nghe Can Bo");
            System.out.println("1: Cong Nhan");
            System.out.println("2: Ky Su");
            System.out.println("3: Nhan Vien");
            int type = scanner.nextInt();
            if (type==1){
                CanBo cb = new CongNhan();
                cb.nhap();
                list.add(cb);
            }
        }
    }
    public void xuat(String name){
//        for (CanBo i: list){
//            i.xuat();
//        }
        List<CanBo> filteredList = this.list.stream()
                .filter(o -> o.getName().contains(name))
                .collect(Collectors.toList());

        for (CanBo i: filteredList){
            i.xuat();
        }
    }
    public static void main(String[] args) {
        QuanLyCanBo quanLyCanBo = new QuanLyCanBo();
        quanLyCanBo.them();
        System.out.println("Tim Kiem Theo Ten");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        quanLyCanBo.xuat(name);
    }
}
