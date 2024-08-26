package NhomMau;

public class O extends NM{
    public O() {
        this.nhommau = _O;
    }
    public boolean kt(NM cha, NM con){
        if (cha.nhommau == _A){
            if(con.nhommau == _O || con.nhommau == _A){
                return true;
            }
        }else if (cha.nhommau == _B){
            if(con.nhommau == _O || con.nhommau == _B){
                return true;
            }
        }
        else if (cha.nhommau == _AB){
            if( con.nhommau == _A||con.nhommau == _B){
                return true;
            }
        }
        else if (cha.nhommau == _O){
            if( con.nhommau == _O){
                return true;
            }
        }
        return false;
    }
}
