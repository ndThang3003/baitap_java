package xe;

import java.util.Date;

public class Nguoi_mua_xe extends Nguoi {
    private int so_tich_diem;
    private Date ngay_mua;
    private String ten_xe;
    public Nguoi_mua_xe(String Hoten, int SDT, int CCCD, Date ngay_mua, int so_tich_diem, String ten_xe) {
        super(Hoten, SDT, CCCD);
        this.ngay_mua = ngay_mua;
        this.so_tich_diem = so_tich_diem;
        this.ten_xe = ten_xe;
    }

    public void setSo_tich_diem(int so_tich_diem) {
        this.so_tich_diem = so_tich_diem;
    }

    public int getSo_tich_diem() {
        return so_tich_diem;
    }
    public void setNgay_mua(Date ngay_mua) {
        this.ngay_mua = ngay_mua;
    }
    public Date getNgay_mua() {
        return ngay_mua;
    }
    public void setTen_xe(String ten_xe) {
        this.ten_xe = ten_xe;
    }
    public String getTen_xe() {
        return ten_xe;
    }
}
