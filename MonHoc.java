public class MonHoc {
    private String maMH;
    private String tenMH;
    private double diem;
    public MonHoc(String maMH, String tenMH, double diem) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.diem = -1; // điểm mặc định chưa nhập (-1)
    }
    public String getMaMH() {
        return maMH;
    }
    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }
    public String getTenMH() {
        return tenMH;
    }
    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }
    public double getDiem() {
        return diem;
    }
    public void setDiem(double diem) {
        this.diem = diem;
    }
    public String toString(){
        return "ma mon hoc: "+ maMH+" ten mon hoc: "+ tenMH+" diem: "+(diem == -1? "chua co": diem);
    }
}