/*package datvemb;

public class QuanLyChuyenBay {
    public void hienThiMenu() {
        Scanner sc = new Scanner(System.in);
        int luaChon;

        do {
            System.out.println("\n=== QUẢN LÝ ĐẶT VÉ MÁY BAY ===");
            System.out.println("1. Quản lý hành khách");
            System.out.println("2. Quản lý chuyến bay");
            System.out.println("3. Đặt vé");
            System.out.println("4. Hủy vé");
            System.out.println("5. Thống kê");
            System.out.println("0. Thoát");

            System.out.print("Nhập lựa chọn: ");
            luaChon = sc.nextInt();

            switch(luaChon) {
                case 1:
                    menuQuanLyHanhKhach();
                    break;
                case 2:
                    menuQuanLyChuyenBay();
                    break;
                case 3:
                    menuDatVe();
                    break;
                case 4:
                    menuHuyVe();
                    break;
                case 5:
                    menuThongKe();
                    break;
                case 0:
                    System.out.println("Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (luaChon != 0);
    }

}
*/