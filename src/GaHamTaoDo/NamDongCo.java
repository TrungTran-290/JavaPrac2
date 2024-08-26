package GaHamTaoDo;

public class NamDongCo extends NguyenLieu{
    public NamDongCo() {
        this.Carbs = 1;
        this.Fat =0;
        this.FatBH=0;
        this.Protein = 15;
        this.Calo=10;
    }
    int Sl;

    @Override
    public int getSl() {
        return Sl;
    }

    @Override
    public void setSl(int sl) {
        Sl = sl;
    }

}
