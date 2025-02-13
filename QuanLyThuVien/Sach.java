package QuanLyThuVien;

public class Sach implements Printable{
    private String TenSach;
    private String MaSach;
    public boolean TrangThai;
    public Sach(String tenSach, String maSach) {
        TenSach = tenSach;
        MaSach = maSach;
    }

    public String getTenSach() {
        return TenSach;
    }
    public void setTenSach(String tenSach) {
        TenSach = tenSach;
    }
    public String getMaSach() {
        return MaSach;
    }
    public void setMaSach(String maSach) {
        MaSach = maSach;
    }

    @Override
    public void print() {

    }
}
