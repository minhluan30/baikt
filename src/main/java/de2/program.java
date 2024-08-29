/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class program {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QLCauThu qlCauThu = new QLCauThu();

        int choice;
        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Xuất thông tin danh sách cầu thủ và tổng tiền lương CLB phải trả");
            System.out.println("2. Thêm cầu thủ");
            System.out.println("3. Xóa cầu thủ");
            System.out.println("4. Tìm cầu thủ theo số áo");
            System.out.println("5. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            switch (choice) {
                case 1:
                    qlCauThu.xuatThongTinVaTongLuong();
                    break;
                case 2:
                    // Nhập thông tin cầu thủ mới
                    System.out.print("Nhập số áo: ");
                    int soao = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Nhập họ tên: ");
                    String hoten = scanner.nextLine();

                    System.out.print("Nhập năm sinh: ");
                    int namsinh = scanner.nextInt();

                    System.out.print("Nhập lương cứng: ");
                    double luongcung = scanner.nextDouble();

                    System.out.print("Nhập tiền thưởng: ");
                    double tienthuong = scanner.nextDouble();

                    System.out.print("Nhập tiền phạt: ");
                    double tienphat = scanner.nextDouble();

                    CauThu cauThuMoi = new CauThu(soao, hoten, namsinh, luongcung, tienthuong, tienphat);
                    qlCauThu.themCauThu(cauThuMoi);
                    System.out.println("Cầu thủ đã được thêm vào danh sách.");
                    break;
                case 3:
                    // Xóa cầu thủ theo số áo
                    System.out.print("Nhập số áo của cầu thủ cần xóa: ");
                    int soaoXoa = scanner.nextInt();
                    qlCauThu.xoaCauThu(soaoXoa);
                    System.out.println("Cầu thủ đã được xóa khỏi danh sách.");
                    break;
                case 4:
                    // Tìm cầu thủ theo số áo
                    System.out.print("Nhập số áo của cầu thủ cần tìm: ");
                    int soaoTim = scanner.nextInt();
                    CauThu cauThuTim = qlCauThu.timCauThu(soaoTim);
                    if (cauThuTim != null) {
                        System.out.println(cauThuTim);
                    } else {
                        System.out.println("Cầu thủ không tìm thấy.");
                    }
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }
}

