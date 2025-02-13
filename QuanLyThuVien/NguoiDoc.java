package QuanLyThuVien;

import java.util.Date;

public class NguoiDoc extends Nguoi {
    private String MaSv;
    private Date NgayMuon;
    private Date NgayTra;

    public NguoiDoc(String HoTen, int Sdt, String email, String MaSv, Date NgayMuon, Date NgayTra) {
        super(HoTen, Sdt, email);
        this.MaSv = MaSv;
        this.NgayMuon = NgayMuon;
        this.NgayTra = NgayTra;
    }
    public String getMaSv() {
        return MaSv;
    }
    public void setMaSv(String MaSv) {
        this.MaSv = MaSv;
    }
    public Date getNgayMuon() {
        return NgayMuon;
    }
    public void setNgayMuon(Date NgayMuon) {
        this.NgayMuon = NgayMuon;
    }
    public Date getNgayTra() {
        return NgayTra;
    }
    public void setNgayTra(Date NgayTra) {
        this.NgayTra = NgayTra;
    }


}


