package GaHamTaoDo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists extends NguyenLieu {
    public static final int flag_carb = 1;
    public static final int flag_fat = 2;
    public static final int flag_fatbh = 3;
    public static final int flag_protein = 4;
    public static final int flag_calo = 5;

    List<NguyenLieu> arr;

    public Lists() {
        arr = new ArrayList<>();
    }

    public void Nhap() {
        System.out.println("Sl Ga: ");
        Scanner scanner = new Scanner(System.in);
        Ga ga = new Ga();
        ga.Sl = scanner.nextInt();
        arr.add(ga);

        System.out.println("Sl HatSen: ");
        HatSen hatSen = new HatSen();
        hatSen.Sl = scanner.nextInt();
        arr.add(hatSen);

        System.out.println("Sl CaRot: ");
        CaRot caRot = new CaRot();
        caRot.Sl = scanner.nextInt();
        arr.add(caRot);
        System.out.println("Sl TaoDo: ");
        TaoDo taoDo = new TaoDo();
        taoDo.Sl = scanner.nextInt();
        arr.add(taoDo);
        System.out.println("Sl namDongCo: ");
        NamDongCo namDongCo = new NamDongCo();
        namDongCo.Sl = scanner.nextInt();
        arr.add(namDongCo);
    }

    public int Xuat(int flag) {
        int sum = 0;
        for (NguyenLieu i : arr) {
            if (flag == flag_carb) {
                sum += i.getCarbs() * i.getSl();
            } else if (flag == flag_fat) {
                sum += i.getFat() * i.getSl();
            } else if (flag == flag_fatbh) {
                sum += i.getFatBH() * i.getSl();
            } else if (flag == flag_protein) {
                sum += i.getProtein() * i.getSl();
            } else if (flag == flag_calo) {
                sum += i.getCalo() * i.getSl();
            }
        }
        return sum;
    }
    public int cau2_2(int flag) {
        return (int) this.arr.stream()
                .mapToDouble(a -> {
                    if (flag == flag_calo) {
                        return a.getSl() * a.getCarbs();
                    } else if (flag == flag_fat) {
                        return a.getFat() * a.getSl();
                    } else if (flag==flag_fatbh) {
                        return a.getFatBH() *a.getSl();
                    } else if (flag == flag_protein) {
                        return a.getProtein()*a.getSl();

                    } else if (flag_carb == flag) {
                        return a.getCarbs() *a.getSl();
                    }
                    return 0;
                })
                .sum();
    }
    public void cau2() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Chi so can thiet");
        float carb = scanner.nextInt();
        int nangluong = cau2_2(flag_carb);
        if (carb > nangluong) {
            System.out.printf("Ban Can %f", carb - nangluong);
        }
        System.out.println("Chi so can thiet");
        float fat = scanner.nextInt();
        nangluong = cau2_2(flag_fat);
        if (fat > nangluong) {
            System.out.printf("\nBan Can %f", fat - nangluong);
        }
        System.out.println("Chi so can thiet");
        float fatbh = scanner.nextInt();
        nangluong = cau2_2(flag_fatbh);
        if (fatbh > nangluong) {
            System.out.printf("Ban Can %f", fatbh - nangluong);
        }
        System.out.println("\nChi so can thiet");
        float protein = scanner.nextInt();
        nangluong = cau2_2(flag_protein);
        if (protein > nangluong) {
            System.out.printf("Ban Can %f", protein - nangluong);
        }
        System.out.println("\nChi so can thiet");
        float calo = scanner.nextInt();
        nangluong = cau2_2(flag_calo);
        if (calo > nangluong) {
            System.out.printf("Ban Can %f", calo - nangluong);
        }
    }



    public float cau3() {
        float nangluong = Xuat(5);
        float thoigian = 0;
        if (nangluong - 600 > 0) {
            thoigian = (float) (30 * (nangluong - 600) / 147.5);
            System.out.println(nangluong);
            return thoigian;
        } else if (nangluong - 600 == 0) {
            System.out.println("An du");
        } else {
            System.out.println("An Thieu: " + (600 - nangluong));
        }
        return 0;
    }
}
