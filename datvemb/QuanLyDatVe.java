/*package datvemb;

public class QuanLyDatVe {
    public boolean thucHienDatVe(String maHanhKhach, String maChuyenBay, char hangGhe) {
        // Tìm hành khách
        HanhKhach hk = timHanhKhach(maHanhKhach);
        if (hk == null) {
            System.out.println("Không tìm thấy hành khách!");
            return false;
        }

        // Kiểm tra chuyến bay
        ChuyenBay cb = timChuyenBay(maChuyenBay);
        if (cb == null) {
            System.out.println("Không tìm thấy chuyến bay!");
            return false;
        }

        // Kiểm tra ghế trống
        if (!cb.kiemTraGheTrong(hangGhe)) {
            System.out.println("Hết ghế loại " + hangGhe);
            return false;
        }

        // Thực hiện đặt vé
        return hk.datVe(maChuyenBay, hangGhe);
    }

}
*/