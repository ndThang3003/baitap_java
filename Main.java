/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        QuanLySinhVien qlsv = new QuanLySinhVien();
        Scanner sc = new Scanner(System.in);
        int luaChon;

        do {
            System.out.println("-------------------");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Sửa thông tin sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Thoát");
            System.out.print("Nhập lựa chọn: ");
            luaChon = sc.nextInt();
            sc.nextLine(); // Đọc dòng mới

            switch (luaChon) {
                case 1:
                    System.out.print("Nhập ID sinh viên: ");
                    String id = sc.nextLine();
                    System.out.print("Nhập tên sinh viên: ");
                    String ten = sc.nextLine();
                    System.out.print("Nhập tuổi sinh viên: ");
                    int tuoi = sc.nextInt();
                    qlsv.themsinhvien(new SinhVien(id, ten, tuoi));
                    break;
                case 2:
                    qlsv.xoaSinhVien();
                    break;
                case 3:
                    System.out.print("Nhập ID sinh viên cần sửa: ");
                    String idtimSinhVien = sc.nextLine();
                    qlsv.timSinhVien(idtimSinhVien);
                    break;
                case 4:
                    System.out.print("Nhập ID sinh viên cần xóa: ");
                    String idXoa = sc.nextLine();
                    qlsv.xoaSinhVien(idXoa);
                    break;
                case 5:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (luaChon != 5);

        sc.close();
    }
}
*/