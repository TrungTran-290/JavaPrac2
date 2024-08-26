package GaHamTaoDo;

public class Ga extends NguyenLieu{
    public Ga() {
        this.Carbs = 0;
        this.Fat = 15;
        this.FatBH=4;
        this.Protein = 17;
        this.Calo=211;
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
