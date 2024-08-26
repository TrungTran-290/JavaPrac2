package GaHamTaoDo;

public class TaoDo extends NguyenLieu{
    public TaoDo() {
        this.Carbs = 3;
        this.Fat =1;
        this.FatBH=0;
        this.Protein = 1;
        this.Calo=52;
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
