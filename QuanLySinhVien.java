import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class QuanLySinhVien {
    private ArrayList<SinhVien>quanLySinhVien;
    public QuanLySinhVien() {
        quanLySinhVien = new ArrayList<>();
    }
    public void themsinhvien( SinhVien sv ){
        quanLySinhVien.add(sv);
        System.out.println("da them sinhvien: "+sv);
    }
    public void hienthidanhsach(){
        if(quanLySinhVien.isEmpty()){
            System.out.println("danh sach sinh vien trong.");
            return;
        }
        System.out.println("danh sach sinh vien:");
        for(SinhVien sv : quanLySinhVien){
            System.out.println(sv);
        }
    }
    public SinhVien timSinhVien(String id) {
        for (SinhVien sv : quanLySinhVien) {
            if (sv.getId().equals(id)) {
                return sv;
            }
        }
        return null;
    }
    public void xoaSinhVien(SinhVien sv){
        quanLySinhVien.clear();
        System.out.println("da xoa sinh vien"+sv);
    }


    public void capNhatDiem(String idSinhVien, String maMH, double diem) {
        SinhVien sv = timSinhVien(idSinhVien);
        if (sv != null) {
            sv.capNhatDiem(maMH, diem);
        } else {
            System.out.println("Không tìm thấy sinh viên với ID: " + idSinhVien);
        }
    }

    public void hienThiDiem(String idSinhVien) {
        SinhVien sv = timSinhVien(idSinhVien);
        if (sv != null) {
            sv.hienThiDiem();
        } else {
            System.out.println("Không tìm thấy sinh viên với ID: " + idSinhVien);
        }
    }

    public static class EmployeeApp extends Application {

        private TableView<Employee> table;
        private ObservableList<Employee> employees;

        public static void main(String[] args) {
            launch(args); // Khởi chạy ứng dụng
        }

        @Override
        public void start(Stage stage) {
            stage.setTitle("Employee Management - JavaFX");

            // Dữ liệu mẫu cho bảng
            employees = FXCollections.observableArrayList(
                    new Employee(100, "Steven", "King", "SKING", "515.123.4567"),
                    new Employee(101, "Neena", "Kochhar", "NKOCHHAR", "515.123.4568"),
                    new Employee(102, "Lex", "De Haan", "LDEHAAN", "590.423.4567"),
                    new Employee(103, "Alexander", "Hunold", "ahunold", "590.423.4568"),
                    new Employee(104, "Bruce", "Ernst", "BERNST", "590.423.4569"),
                    new Employee(105, "David", "Austin", "DAUSTIN", "590.423.4570"),
                    new Employee(106, "Valli", "Pataballa", "VPATABAL", "590.423.4571")
            );

            // Cột của bảng
            TableColumn<Employee, Integer> idColumn = new TableColumn<>("Id");
            idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));

            TableColumn<Employee, String> nameColumn = new TableColumn<>("Name");
            nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

            TableColumn<Employee, String> lastNameColumn = new TableColumn<>("LastName");
            lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));

            TableColumn<Employee, String> emailColumn = new TableColumn<>("Email");
            emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));

            TableColumn<Employee, String> phoneColumn = new TableColumn<>("Phone");
            phoneColumn.setCellValueFactory(new PropertyValueFactory<>("phone"));

            // Tạo bảng và thêm cột
            table = new TableView<>();
            table.setItems(employees);
            table.getColumns().addAll(idColumn, nameColumn, lastNameColumn, emailColumn, phoneColumn);

            // Trường nhập liệu
            TextField nameField = new TextField();
            nameField.setPromptText("Name");

            TextField lastNameField = new TextField();
            lastNameField.setPromptText("LastName");

            TextField emailField = new TextField();
            emailField.setPromptText("Email");

            TextField idField = new TextField();
            idField.setPromptText("Employee ID");

            TextField newEmailField = new TextField();
            newEmailField.setPromptText("New Email");

            // Nút thêm nhân viên
            Button addButton = new Button("Add Employee");
            addButton.setOnAction(e -> {
                employees.add(new Employee(
                        employees.size() + 1,
                        nameField.getText(),
                        lastNameField.getText(),
                        emailField.getText(),
                        "123.456.7890"
                ));
                nameField.clear();
                lastNameField.clear();
                emailField.clear();
            });

            // Nút tìm kiếm nhân viên
            Button searchButton = new Button("Search");
            searchButton.setOnAction(e -> {
                int id = Integer.parseInt(idField.getText());
                employees.stream()
                        .filter(emp -> emp.getId() == id)
                        .findFirst()
                        .ifPresent(emp -> {
                            table.getSelectionModel().select(emp);
                            table.scrollTo(emp);
                        });
            });

            // Nút cập nhật email nhân viên
            Button updateButton = new Button("Update");
            updateButton.setOnAction(e -> {
                int id = Integer.parseInt(idField.getText());
                employees.stream()
                        .filter(emp -> emp.getId() == id)
                        .findFirst()
                        .ifPresent(emp -> emp.setEmail(newEmailField.getText()));
                table.refresh();
            });

            // Nút xóa nhân viên
            Button deleteButton = new Button("Delete");
            deleteButton.setOnAction(e -> {
                int id = Integer.parseInt(idField.getText());
                employees.removeIf(emp -> emp.getId() == id);
            });

            // Nút hiển thị tất cả nhân viên
            Button showAllButton = new Button("Search All Employees");
            showAllButton.setOnAction(e -> table.setItems(employees));

            // Layout giao diện
            GridPane inputGrid = new GridPane();
            inputGrid.setPadding(new Insets(10));
            inputGrid.setHgap(10);
            inputGrid.setVgap(10);

            inputGrid.add(new Label("Name:"), 0, 0);
            inputGrid.add(nameField, 1, 0);
            inputGrid.add(new Label("LastName:"), 0, 1);
            inputGrid.add(lastNameField, 1, 1);
            inputGrid.add(new Label("Email:"), 0, 2);
            inputGrid.add(emailField, 1, 2);
            inputGrid.add(addButton, 1, 3);

            inputGrid.add(new Label("Employee ID:"), 0, 4);
            inputGrid.add(idField, 1, 4);
            inputGrid.add(searchButton, 2, 4);
            inputGrid.add(new Label("New Email:"), 0, 5);
            inputGrid.add(newEmailField, 1, 5);
            inputGrid.add(updateButton, 2, 5);

            inputGrid.add(deleteButton, 1, 6);
            inputGrid.add(showAllButton, 2, 6);

            VBox layout = new VBox(10, inputGrid, table);
            layout.setPadding(new Insets(10));

            // Scene
            Scene scene = new Scene(layout, 800, 600);
            stage.setScene(scene);
            stage.show();
        }
    }
}