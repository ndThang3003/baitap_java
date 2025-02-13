/*package datvemb;

public class HanhKhach implements IHanhKhach{
    // Thuộc tính
    private String id;
    private String tenHanhKhach;
    private int namSinh;
    private String soHoChieu;
    private String idHangBay;
    private String maTheThanhVien;
    private double soDamBayTichLuy;
    private char hangTheThanhVien;
    private Ticket[] danhSachVe;
    private String diaChi;
    private static int soVeToiDa = 5;

    // Constructor
    public HanhKhach(String id, String ten, int namSinh, String soHoChieu) {
        this.id = id;
        this.tenHanhKhach = ten;
        this.namSinh = namSinh;
        this.soHoChieu = soHoChieu;
        this.soDamBayTichLuy = 0;
        this.hangTheThanhVien = 'B';
        this.danhSachVe = new Ticket[soVeToiDa];
    }

    // Getter và Setter
    // ... (thêm các getter/setter cho tất cả thuộc tính)

    // Implement các phương thức từ interface
    @Override
    public boolean datVe(String maChuyenBay, char hangGhe) {
        // Kiểm tra số vé đã đặt
        if (demSoVeDaDat() >= soVeToiDa) {
            System.out.println("Đã đạt số vé tối đa!");
            return false;
        }

        // Kiểm tra thời gian đặt vé
        if (!kiemTraThoiGianDatVe(maChuyenBay)) {
            System.out.println("Không thể đặt vé trước giờ bay dưới 2 giờ!");
            return false;
        }

        // Tạo vé mới
        Ticket veeMoi = taoVeMoi(maChuyenBay, hangGhe);
        if (veeMoi == null) {
            return false;
        }

        // Thêm vào danh sách vé
        return themVaoDS(veeMoi);
    }

    private int demSoVeDaDat() {
        int count = 0;
        for (Ticket ve : danhSachVe) {
            if (ve != null && ve.getTrangThai() == 'B') {
                count++;
            }
        }
        return count;
    }

    private boolean kiemTraThoiGianDatVe(String maChuyenBay) {
        // Code kiểm tra thời gian
        return true; // Giả sử luôn hợp lệ
    }
}
*/

