package NhomMau;

public class B extends NM{
    public B() {
        this.nhommau = _B;
    }
    public boolean kt(NM cha, NM con){
        if (cha.nhommau == _B|| cha.nhommau == _O){
            if(con.nhommau == _O || con.nhommau == _A){
                return true;
            }
        }else if (cha.nhommau == _A){
            if(con.nhommau == _O || con.nhommau == _A|| con.nhommau == _AB||con.nhommau == _B){
                return true;
            }
        }
        else if (cha.nhommau == _AB){
            if( con.nhommau == _A|| con.nhommau == _AB||con.nhommau == _B){
                return true;
            }
        }
        return false;
    }

}
