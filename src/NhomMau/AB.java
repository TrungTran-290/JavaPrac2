package NhomMau;

public class AB extends NM{
    public AB() {
        this.nhommau = _AB;
    }
    public boolean kt(NM cha, NM con){
        if (cha.nhommau != _O){
            if(con.nhommau != _O){
                return true;
            }
        }else if (cha.nhommau == _O){
            if(con.nhommau == _A||con.nhommau == _B){
                return true;
            }
        }
        return false;
    }
}
