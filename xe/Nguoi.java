package xe;

public class Nguoi implements Printable {
    private String HoTen;
    private int SDT;
    private int CCCD;
    public Nguoi(String HoTen, int SDT, int CCCD) {
        this.HoTen = HoTen;
        this.SDT = SDT;
        this.CCCD = CCCD;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }
    public String getHoTen() {
        return HoTen;
    }
    public void setSDT(int SDT) {
        this.SDT = SDT;
    }
    public int getSDT() {
        return SDT;
    }
    public void setCCCD(int CCCD) {
        this.CCCD = CCCD;
    }
    public int getCCCD() {
        return CCCD;
    }

    @Override
    public void print() {

    }
}
