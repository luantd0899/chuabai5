package com.vti.backend;

import com.vti.entity.CanBo;
import com.vti.entity.CongNhan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {

    private Scanner scanner;
    private List<CanBo> canBos;

    public QLCB() {
        scanner = new Scanner(System.in);
        canBos = new ArrayList<>();
    }

    public void themCanBo(){
        System.out.println("Bạn muốn thêm Cán Bộ nào: 1. Công Nhân, 2. Kỹ Sư, 3. Nhân Viên");
        System.out.println("=============Mời bạn chọn=============");
        int choose = scanner.nextInt();
        scanner.nextLine();
        switch (choose){
            case 1:
                System.out.println("Thêm mới Công Nhân.");

                System.out.println("Nhập họ tên: ");
                String name = scanner.nextLine();

                System.out.println("Nhập tuổi: ");
                int age = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Nhập giới tính: ");
                String gender = scanner.nextLine();

                System.out.println("Nhập địa chỉ: ");
                String address = scanner.nextLine();

                System.out.println("Nhập cấp bậc: ");
                int level = scanner.nextInt();

                CanBo congNhan = new CongNhan(name, age, gender, address, level);
                canBos.add(congNhan);
                break;

            case 2:
                System.out.println("Thêm mới Kỹ Sư.");
                break;

            case 3:
                System.out.println("Thêm mới Nhân Viên.");
                break;

            default:
                System.out.println("Bạn đã nhập sai, mời bạn nhập lại");
                break;
        }
    }

    public void timKiemTheoHoTen(){

    }

    public void hienThiThongTin(){
        for (CanBo c :
                canBos) {
            System.out.println(c);
        }
    }

    public void xoaCanBoTheoTen(){

    }


}
