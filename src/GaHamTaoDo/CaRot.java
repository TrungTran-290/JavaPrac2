package GaHamTaoDo;

public class CaRot extends NguyenLieu{
    public CaRot() {
        this.Carbs = 10;
        this.Fat =3;
        this.FatBH=0;
        this.Protein = 1;
        this.Calo=41;
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
