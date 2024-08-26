package NhomMau;

public class A extends NM{
    public A() {
        this.nhommau = _A;
    }
    public boolean kt(NM cha, NM con){
        if (cha.nhommau == _A || cha.nhommau == _O){
            if(con.nhommau == _O || con.nhommau == _A){
                return true;
            }
        }else if (cha.nhommau == _B){
            if(con.nhommau == _O || con.nhommau == _A|| con.nhommau == _AB||con.nhommau == _B){
                return true;
            }
        }
        else if (cha.nhommau == _AB){
            if(con.nhommau == _A|| con.nhommau == _AB||con.nhommau == _B){
                return true;
            }
        }
        return false;
    }
}
