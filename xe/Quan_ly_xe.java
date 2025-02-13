package xe;

import java.util.*;

public class Quan_ly_xe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<HashMap<String, String>> danhsachnguoimua = new ArrayList<>();
        Set<String> danhsachxe = new HashSet<>(Arrays.asList(
                "aaa", "bbb", "ccc", "ddd", "eee", "fff"));

        while (true) {
            System.out.println("====== Quản lý xe =====");
            System.out.println("1. Nhập thông tin người mua xe");
            System.out.println("2. Tìm người mua xe theo ngày mua");
            System.out.println("3. Tính tiền mua xe của người mua");
            System.out.println("4. Danh sách người mua theo ngày mua hoặc số tích điểm");
            System.out.println("5. In danh sách người mua");
            System.out.println("6. Xem các xe còn lại");
            System.out.println("7. Thoát chương trình");
            System.out.print("Nhập lựa chọn: ");

            int chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    HashMap<String, String> Nguoimua = new HashMap<>();
                    System.out.println("Nhập tên người mua:");
                    Nguoimua.put("tên", sc.nextLine());

                    System.out.println("Nhập ngày mua:");
                    Nguoimua.put("ngày mua", sc.nextLine());

                    System.out.println("Nhập số điện thoại:");
                    Nguoimua.put("sdt", sc.nextLine());

                    System.out.println("Nhập CCCD:");
                    Nguoimua.put("cccd", sc.nextLine());

                    System.out.println("Nhập số tích điểm:");
                    Nguoimua.put("số tích điểm", sc.nextLine());

                    System.out.println("Nhập tên xe:");
                    String tenxe = sc.nextLine();

                    if (danhsachxe.contains(tenxe)) {
                        Nguoimua.put("tên xe", tenxe);
                        danhsachxe.remove(tenxe);
                        danhsachnguoimua.add(Nguoimua);
                        System.out.println("Đã thêm thông tin người mua.");
                    } else {
                        System.out.println("Xe này đã hết hoặc không tồn tại.");
                    }
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
    }
}
