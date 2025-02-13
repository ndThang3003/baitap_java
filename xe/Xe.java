package xe;

import java.util.Date;

public class Xe implements Printable {
    private String Ten_Xe;
    private String Ma_Xe;
    private int Ma_Thue;
    private int Gia;
    private Date Ngay_Nhap;
    private Boolean Trang_Thai;
    public Xe(String Ten_Xe, String Ma_Xe, int Ma_Thue, int Gia, Date Ngay_Nhap) {
        this.Ten_Xe = Ten_Xe;
        this.Ma_Xe = Ma_Xe;
        this.Ma_Thue = Ma_Thue;
        this.Gia = Gia;
        this.Ngay_Nhap = Ngay_Nhap;
    }
    public String getTen_Xe() {
        return Ten_Xe;
    }
    public void setTen_Xe(String ten_Xe) {
        Ten_Xe = ten_Xe;
    }
    public String getMa_Xe() {
        return Ma_Xe;
    }
    public void setMa_Xe(String ma_Xe) {
        Ma_Xe = ma_Xe;
    }
    public int getMa_Thue() {
        return Ma_Thue;
    }
    public void setMa_Thue(int ma_Thue) {
        Ma_Thue = ma_Thue;
    }
    public int getGia() {
        return Gia;
    }
    public void setGia(int gia) {
        Gia = gia;
    }
    public Date getNgay_Nhap() {
        return Ngay_Nhap;
    }
    public void setNgay_Nhap(Date ngay_Nhap) {
        Ngay_Nhap = ngay_Nhap;
    }
    public Boolean getTrang_Thai() {
        return Trang_Thai;
    }
    public void setTrang_Thai(Boolean trang_Thai) {
        Trang_Thai = trang_Thai;
    }

    @Override
    public void print() {

    }
}
