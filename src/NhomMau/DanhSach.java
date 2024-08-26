package NhomMau;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSach {
    private static List<NM> arr;

    public DanhSach() {
        this.arr = new ArrayList<>();
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap So nguoi");
        int n = scanner.nextInt();
        for (int i =0;i<n;i++){
            System.out.println("Nhap Thong Tin Nguoi N"+(i+1));
            System.out.println("1=O");
            System.out.println("2=A");
            System.out.println("3=B");
            System.out.println("4=AB");
            int nhom = scanner.nextInt();
            if(nhom == 1){
                NM a = new O();
//                a.nhap();
                arr.add(a);
            }else if(nhom == 2){
                NM a = new A();
//                a.nhap();
                arr.add(a);
            }else if(nhom == 3){
                NM a = new B();
//                a.nhap();
                arr.add(a);
            }else if(nhom == 4){
                NM a = new AB();
//                a.nhap();
                arr.add(a);
            }
        }
    }
    public void xuat(){
        for (NM i : arr){
            i.xuat();
        }
    }
    public static void main(String[] args) {
        DanhSach nm = new DanhSach();
        nm.nhap();
        nm.xuat();
        if(arr.get(0).kt(arr.get(1),arr.get(2))){
            System.out.println("riu");
        }else {
            System.out.println("fa ke");
        }
    }
}
