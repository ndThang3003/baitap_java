/*package datvemb;

public class Ticket {
    private String maVe;
    private String maChuyenBay;
    private String maGhe;
    private char hangGhe;
    private double giaVe;
    private char trangThai;
    private HanhKhach hanhKhach;
    private String ngayDatVe;

    // Constructor
    public Ticket(String maVe, String maChuyenBay, String maGhe,
                  char hangGhe, HanhKhach hanhKhach) {
        this.maVe = maVe;
        this.maChuyenBay = maChuyenBay;
        this.maGhe = maGhe;
        this.hangGhe = hangGhe;
        this.hanhKhach = hanhKhach;
        this.trangThai = 'B';
        this.giaVe = tinhGiaVe();
        this.ngayDatVe = getCurrentDateTime();
    }

    private double tinhGiaVe() {
        double giaCoBan = 0;
        switch(hangGhe) {
            case 'Y': giaCoBan = 1000000; break;
            case 'B': giaCoBan = 3000000; break;
            case 'F': giaCoBan = 5000000; break;
        }

        // Áp dụng giảm giá theo hạng thẻ
        switch(hanhKhach.getHangTheThanhVien()) {
            case 'S': giaCoBan *= 0.95; break;
            case 'G': giaCoBan *= 0.90; break;
        }

        return giaCoBan;
    }

}
*/