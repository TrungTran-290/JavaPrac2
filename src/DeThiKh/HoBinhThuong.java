package DeThiKh;

public class HoBinhThuong extends KhachHang {
    public HoBinhThuong(String makh, String tenkh, int chisocu, int chisomoi, int sotien) {
        super(makh, tenkh, chisocu, chisomoi, sotien);
    }

    public HoBinhThuong() {
    }
    public int chisotieuthu(){
        return getChisomoi() - getChisocu();
    }
    @Override
    public long tinhtiendien() {
        int consumption = chisotieuthu(); // Get the electricity consumption

        long bill = 0; // Initialize bill amount

        if (consumption >= 1 && consumption <= 50) {
            bill = consumption * 1500; // Rate for 1-50 kWh
        } else if (consumption >= 51 && consumption <= 100) {
            bill = (50 * 1500) + ((consumption - 50) * 2000); // Rate for 51-100 kWh
        } else if (consumption > 100) {
            bill = (50 * 1500) + (50 * 2000) + ((consumption - 100) * 2800); // Rate for over 100 kWh
        }

        return bill;
    }


    @Override
    public double tienthanhtoan() {
        return (tinhtiendien() + tinhtiendien() * 0.1);
    }
}
