package Bai1_OOP;

public class KySu extends CanBo{
    public KySu(String name, int tuoi, String gioitinh, String diachi) {
        super(name, tuoi, gioitinh, diachi);
    }
    private String nghanhdaotao;

    public KySu() {
    }

    public String getNghanhdaotao() {
        return nghanhdaotao;
    }

    public void setNghanhdaotao(String nghanhdaotao) {
        this.nghanhdaotao = nghanhdaotao;
    }
}
