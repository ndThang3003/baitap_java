import java.util.ArrayList;

public class SinhVien {
    private String id;
    private String ten;
    private int tuoi;
    private ArrayList<MonHoc>MonHoc;
    public SinhVien(String id, String ten, int tuoi) {
        this.id = id;
        this.ten = ten;
        this.tuoi = tuoi;
        MonHoc = new ArrayList<>();
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public ArrayList<MonHoc> getMonHoc() {
        return MonHoc;
    }
    public void setMonHoc(ArrayList<MonHoc> MonHoc) {
        this.MonHoc = MonHoc;
    }
    public void addMonHoc(MonHoc monHoc) {
        MonHoc.add(monHoc);
        System.out.println("da dang ki mon hoc: " + monHoc);
    }
    public void capNhatDiem(String maMH, double diem) {
        for (MonHoc mh :MonHoc) {
            if (mh.getMaMH().equals(maMH)) {
                mh.setDiem(diem);
                System.out.println("Đã cập nhật điểm cho môn học: " + mh);
                return;
            }
        }
        System.out.println("Không tìm thấy môn học với mã: " + maMH);
    }

    public void hienThiDiem() {
        if (MonHoc.isEmpty()) {
            System.out.println("Sinh viên chưa đăng ký môn học nào.");
            return;
        }
        System.out.println("Danh sách môn học và điểm:");
        for (MonHoc mh : MonHoc) {
            System.out.println(mh);
        }
    }


    @Override
    public String toString() {
        return "ID = " + id + ", ten = " + ten + ", tuoi = " + tuoi;
    }
}
