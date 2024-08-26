package GaHamTaoDo;

public class NguyenLieu {
    protected int Carbs;
    protected int Fat;
    protected int FatBH;
    protected int Protein;
    protected int Calo;
    protected int Sl;

    public NguyenLieu() {
    }

    public NguyenLieu(int sl,int carbs, int fat, int fatBH, int protein, int calo) {
        Carbs = carbs;
        Fat = fat;
        FatBH = fatBH;
        Protein = protein;
        Calo = calo;
        Sl=sl;
    }

    public int getSl() {
        return Sl;
    }

    public void setSl(int sl) {
        Sl = sl;
    }

    public int getCarbs() {
        return Carbs;
    }

    public void setCarbs(int carbs) {
        Carbs = carbs;
    }

    public int getFat() {
        return Fat;
    }

    public void setFat(int fat) {
        Fat = fat;
    }

    public int getFatBH() {
        return FatBH;
    }

    public void setFatBH(int fatBH) {
        FatBH = fatBH;
    }

    public int getProtein() {
        return Protein;
    }

    public void setProtein(int protein) {
        Protein = protein;
    }

    public int getCalo() {
        return Calo;
    }

    public void setCalo(int calo) {
        Calo = calo;
    }
    public int tinhCalo(){
        return getCalo()*getSl();
    }
}
