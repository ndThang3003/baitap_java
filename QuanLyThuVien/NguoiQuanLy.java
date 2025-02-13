package QuanLyThuVien;

public class NguoiQuanLy extends Nguoi{
    private int CanCuoc;

    public NguoiQuanLy(String HoTen, int Sdt, String email, int CanCuoc) {
        super(HoTen, Sdt, email);
    }
    public int getCanCuoc() {
        return CanCuoc;
    }
    public void setCanCuoc(int CanCuoc) {
        this.CanCuoc = CanCuoc;
    }

}
