package NhomMau;

import java.util.Scanner;

public abstract class NM {
    protected int nhommau;
    protected boolean loai;

    public static int _O=1;
    public static int _A=2;
    public static int _B=3;
    public static int _AB=4;

    public NM() {
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap loai RH");
        this.loai = scanner.nextBoolean();
    }
    public void xuat(){
        if(this.nhommau == _O){
            System.out.print("Nhom mau: 0");
        }
        else if(this.nhommau == _A){
            System.out.print("Nhom mau: A");
        }
        else if(this.nhommau == _B){
            System.out.print("Nhom mau: B");
        }
        else if(this.nhommau == _AB){
            System.out.print("Nhom mau: AB");
        }
        if (loai == true){
            System.out.println("+");
        }else {
            System.out.println("-");
        }
    }

    public boolean isLoai() {
        return loai;
    }

    public void setLoai(boolean loai) {
        this.loai = loai;
    }

    public abstract boolean kt(NM cha, NM con);
}
