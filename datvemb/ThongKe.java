/*package datvemb;

public class ThongKe {
    public double thongKeDoanhThu(String ngayBatDau, String ngayKetThuc) {
        double tongDoanhThu = 0;

        for (Ticket ve : danhSachVe) {
            if (ve != null &&
                    ve.getTrangThai() == 'B' &&
                    namTrongKhoang(ve.getNgayDatVe(), ngayBatDau, ngayKetThuc)) {
                tongDoanhThu += ve.getGiaVe();
            }
        }

        return tongDoanhThu;
    }

    private boolean namTrongKhoang(String ngay, String batDau, String ketThuc) {
        // Code kiểm tra ngày
        return true; // Giả sử luôn hợp lệ
    }

}
*/