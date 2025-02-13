package QuanLyThuVien;

public class Nguoi implements Printable{
    private String HoTen;
    private int Sdt;
    private String email;
    public Nguoi(String HoTen, int Sdt, String email) {
        this.HoTen = HoTen;
        this.Sdt = Sdt;
        this.email = email;
    }
    public String getHoTen() {
        return HoTen;
    }
    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }
    public int getSdt() {
        return Sdt;
    }
    public void setSdt(int Sdt) {
        this.Sdt = Sdt;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public void print() {

    }
}
