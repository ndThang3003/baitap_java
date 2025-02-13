package QuanLyThuVien;

import java.util.*;

public class QuanLyThuVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Danh sách lưu thông tin người đọc
        ArrayList<HashMap<String, String>> danhSachNguoiDoc = new ArrayList<>();

        // Danh sách sách còn lại trong thư viện
        Set<String> sachThuVien = new HashSet<>(Arrays.asList(
                "Đảo Mộng Mơ", "Đắc Nhân Tâm", "Nhà Giả Kim", "Bí Mật Của Nước", "Tuổi Trẻ Đáng Giá Bao Nhiêu", "Trước Bình Minh", "Chưa Kịp Lớn Đã Phải Trưởng Thành"
        ));

        // Thêm dữ liệu thực tế
        HashMap<String, String> nguoiDoc1 = new HashMap<>();
        nguoiDoc1.put("ten", "Thắng");
        nguoiDoc1.put("ngayMuon", "2024-06-01");
        nguoiDoc1.put("ngayTra", "2024-06-10");
        nguoiDoc1.put("tenSach", "Tuổi Trẻ Đáng Giá Bao Nhiêu");

        HashMap<String, String> nguoiDoc2 = new HashMap<>();
        nguoiDoc2.put("ten", "Linh");
        nguoiDoc2.put("ngayMuon", "2024-06-02");
        nguoiDoc2.put("ngayTra", "2024-06-11");
        nguoiDoc2.put("tenSach", "Đắc Nhân Tâm");

        HashMap<String, String> nguoiDoc3 = new HashMap<>();
        nguoiDoc3.put("ten", "Minh");
        nguoiDoc3.put("ngayMuon", "2024-06-03");
        nguoiDoc3.put("ngayTra", "2024-06-12");
        nguoiDoc3.put("tenSach", "Nhà Giả Kim");

        HashMap<String, String> nguoiDoc4 = new HashMap<>();
        nguoiDoc4.put("ten", "Hùng");
        nguoiDoc4.put("ngayMuon", "2024-06-04");
        nguoiDoc4.put("ngayTra", "2024-06-13");
        nguoiDoc4.put("tenSach", "Bí Mật Của Nước");

        HashMap<String, String> nguoiDoc5 = new HashMap<>();
        nguoiDoc5.put("ten", "Lan");
        nguoiDoc5.put("ngayMuon", "2024-06-05");
        nguoiDoc5.put("ngayTra", "2024-06-14");
        nguoiDoc5.put("tenSach", "Đảo Mộng Mơ");

        // Thêm dữ liệu vào danh sách người đọc nếu sách còn trong thư viện
        if (sachThuVien.contains("Tuổi Trẻ Đáng Giá Bao Nhiêu")) {
            danhSachNguoiDoc.add(nguoiDoc1);
            sachThuVien.remove("Tuổi Trẻ Đáng Giá Bao Nhiêu");
        }
        if (sachThuVien.contains("Đắc Nhân Tâm")) {
            danhSachNguoiDoc.add(nguoiDoc2);
            sachThuVien.remove("Đắc Nhân Tâm");
        }
        if (sachThuVien.contains("Nhà Giả Kim")) {
            danhSachNguoiDoc.add(nguoiDoc3);
            sachThuVien.remove("Nhà Giả Kim");
        }
        if (sachThuVien.contains("Bí Mật Của Nước")) {
            danhSachNguoiDoc.add(nguoiDoc4);
            sachThuVien.remove("Bí Mật Của Nước");
        }
        if (sachThuVien.contains("Đảo Mộng Mơ")) {
            danhSachNguoiDoc.add(nguoiDoc5);
            sachThuVien.remove("Đảo Mộng Mơ");
        }

        System.out.println("Đã thêm 5 người đọc vào danh sách.");

        while (true) {
            System.out.println("\n--- Quản lý thư viện ---");
            System.out.println("1. Nhập thông tin người đọc");
            System.out.println("2. Tìm người đọc theo ngày mượn/trả");
            System.out.println("3. Sắp xếp danh sách theo ngày mượn");
            System.out.println("4. In danh sách người đọc");
            System.out.println("5. Kiểm tra sách đã mượn và còn lại");
            System.out.println("6. Thoát chương trình");
            System.out.print("Nhập lựa chọn của bạn: ");

            int luaChon = scanner.nextInt();
            scanner.nextLine(); // Xóa bộ nhớ đệm

            switch (luaChon) {
                case 1:
                    // Nhập thông tin người đọc
                    HashMap<String, String> nguoiDoc = new HashMap<>();
                    System.out.print("Nhập tên người đọc: ");
                    nguoiDoc.put("ten", scanner.nextLine());

                    System.out.print("Nhập ngày mượn sách (yyyy-MM-dd): ");
                    nguoiDoc.put("ngayMuon", scanner.nextLine());

                    System.out.print("Nhập ngày trả sách (yyyy-MM-dd): ");
                    nguoiDoc.put("ngayTra", scanner.nextLine());

                    System.out.print("Nhập tên sách: ");
                    String tenSach = scanner.nextLine();

                    if (sachThuVien.contains(tenSach)) {
                        nguoiDoc.put("tenSach", tenSach);
                        danhSachNguoiDoc.add(nguoiDoc);
                        sachThuVien.remove(tenSach);
                        System.out.println("Đã thêm thông tin người đọc.");
                    } else {
                        System.out.println("Sách này đã được mượn hoặc không tồn tại trong thư viện.");
                    }
                    break;

                case 2:
                    // Tìm người đọc theo ngày
                    System.out.print("Nhập ngày cần tìm (yyyy-MM-dd): ");
                    String ngayTim = scanner.nextLine();

                    System.out.println("Danh sách người đọc theo ngày " + ngayTim + ":");
                    for (HashMap<String, String> nd : danhSachNguoiDoc) {
                        if (nd.get("ngayMuon").equals(ngayTim) || nd.get("ngayTra").equals(ngayTim)) {
                            System.out.println("Tên: " + nd.get("ten") + ", Ngày mượn: " + nd.get("ngayMuon")
                                    + ", Ngày trả: " + nd.get("ngayTra") + ", Sách: " + nd.get("tenSach"));
                        }
                    }
                    break;

                case 3:
                    // Sắp xếp danh sách theo ngày mượn
                    danhSachNguoiDoc.sort(Comparator.comparing(nd -> nd.get("ngayMuon")));
                    System.out.println("Danh sách đã được sắp xếp theo ngày mượn.");
                    break;

                case 4:
                    // In danh sách người đọc
                    System.out.println("Danh sách người đọc:");
                    for (HashMap<String, String> nd : danhSachNguoiDoc) {
                        System.out.println("Tên: " + nd.get("ten") + ", Ngày mượn: " + nd.get("ngayMuon")
                                + ", Ngày trả: " + nd.get("ngayTra") + ", Sách: " + nd.get("tenSach"));
                    }
                    break;

                case 5:
                    // Kiểm tra sách còn lại và đã mượn
                    System.out.println("Sách còn lại trong thư viện: " + sachThuVien);
                    System.out.println("Sách đã được mượn:");
                    for (HashMap<String, String> nd : danhSachNguoiDoc) {
                        System.out.println(nd.get("tenSach"));
                    }
                    break;

                case 6:
                    // Thoát chương trình
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại.");
            }
        }
    }
}
