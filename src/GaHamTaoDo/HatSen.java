package GaHamTaoDo;

public class HatSen extends NguyenLieu{
    public HatSen() {
        this.Carbs = 17;
        this.Fat =0;
        this.FatBH=1;
        this.Protein = 4;
        this.Calo=89;
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
