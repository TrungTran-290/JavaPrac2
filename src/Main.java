import GaHamTaoDo.Ga;
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
// System.out.println("Nhap so ga (g): ");
//Ga ga = new Ga;
//ga = scanner.nextInt();
//        System.out.println("Nhap so hatsen (g): ");
//        this.hatsen = scanner.nextInt();
//        System.out.println("Nhap so carot (g): ");
//        this.carot = scanner.nextInt();
//        System.out.println("Nhap so taodo (g): ");
//        this.taodo = scanner.nextInt();
//        System.out.println("Nhap so namdongco (g): ");
//        this.namdongco = scanner.nextInt();