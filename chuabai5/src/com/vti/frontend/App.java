package com.vti.frontend;

import com.vti.backend.QLCB;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        QLCB qlcb = new QLCB();
        Scanner scanner = new Scanner(System.in);


        while (true){
            System.out.println("====================Chương Trình Quản Lý Cán Bộ====================");
            System.out.println("1. Thêm mới cán bộ.");
            System.out.println("2. Tìm kiếm theo họ tên.");
            System.out.println("3. Hiển thị thông tin về danh sách các cán bộ.");
            System.out.println("4. Nhập vào tên của cán bộ và delete cán bộ đó.");
            System.out.println("5. Thoát khỏi chương trình.");

            System.out.println("=============Mời bạn chọn chức năng=============");
            int choose = scanner.nextInt();
            switch (choose){

                case 1:
                    System.out.println("Thêm mới cán bộ.");
                    qlcb.themCanBo();

                    break;

                case 2:
                    System.out.println("Tìm kiếm theo họ tên.");
                    break;

                case 3:
                    System.out.println("Hiển thị thông tin về danh sách các cán bộ.");
                    qlcb.hienThiThongTin();
                    break;

                case 4:
                    System.out.println("Nhập vào tên của cán bộ và delete cán bộ đó.");
                    break;

                case 5:
                    System.out.println("Thoát khỏi chương trình.");
                    return;

                default:
                    System.out.println("Bạn đã nhập sai, mời bạn nhập lại");
                    break;
            }
        }
    }
}
