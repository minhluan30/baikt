/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class QLCauThu {
    ArrayList<CauThu> danhsachCauThu = new ArrayList<>();
    public QLCauThu() {
        danhsachCauThu=new ArrayList<>();
        danhsachCauThu.add(new CauThu(1, "Nguyen Van A", 1990, 5000, 1000, 200));
        danhsachCauThu.add(new CauThu(2, "Tran Thi B", 1991, 5500, 1200, 300));
        danhsachCauThu.add(new CauThu(3, "Le Van C", 1992, 6000, 1400, 250));
        danhsachCauThu.add(new CauThu(4, "Pham Thi D", 1993, 6500, 1500, 100));
        danhsachCauThu.add(new CauThu(5, "Hoang Van E", 1994, 7000, 1600, 150));
        danhsachCauThu.add(new CauThu(6, "Nguyen Thi F", 1995, 7500, 1700, 200));
        danhsachCauThu.add(new CauThu(7, "Vu Van G", 1996, 8000, 1800, 250));
        danhsachCauThu.add(new CauThu(8, "Do Thi H", 1997, 8500, 1900, 300));
        danhsachCauThu.add(new CauThu(9, "Ngo Van I", 1998, 9000, 2000, 350));
        danhsachCauThu.add(new CauThu(10, "Mai Thi J", 1999, 9500, 2100, 400));
        danhsachCauThu.add(new CauThu(11, "Pham Van K", 2000, 10000, 2200, 450));
    }
    public void themCauThu(CauThu cauthu) {
        for (CauThu ct : danhsachCauThu) {
            if (ct.getSoao() == cauthu.getSoao()) {
                System.out.println("Số áo đã có trong danh sách : ");
                return;
            }
        }
        danhsachCauThu.add(cauthu);
        System.out.println("Cầu thủ được thêm là: ");
    }
    public void xuatThongTinVaTongLuong() {
        double tongTienLuong = 0.0;
        System.out.printf("%-10s %-20s %-10s %-15s\n", "Số áo", "Họ tên", "Tuổi", "Lương thực lãnh");
        System.out.println("---------------------------------------------------------");

        for (CauThu cauThu : danhsachCauThu) {
            int tuoi = 2024 - cauThu.getNamsinh(); // Giả sử năm hiện tại là 2024
            double luongThucLanh = cauThu.tinhLuongThucLanh();
            tongTienLuong += luongThucLanh;
            System.out.printf("%-10d %-20s %-10d %-15.2f\n", cauThu.getSoao(), cauThu.getHoten(), tuoi, luongThucLanh);
        }

        System.out.println("---------------------------------------------------------");
        System.out.printf("Tổng tiền lương CLB phải trả: %.2f", tongTienLuong);
    }
     public List<CauThu> timCauThuLuongThapNhat() {
        if (danhsachCauThu.isEmpty()) {
            return new ArrayList<>();
        }
        
        double luongThapNhat = danhsachCauThu.get(0).tinhLuongThucLanh();
        for (CauThu cauThu : danhsachCauThu) {
            double luong = cauThu.tinhLuongThucLanh();
            if (luong < luongThapNhat) {
                luongThapNhat = luong;
            }
        }

        List<CauThu> cauThuLuongThapNhat = new ArrayList<>();
        for (CauThu cauThu : danhsachCauThu) {
            if (cauThu.tinhLuongThucLanh() == luongThapNhat) {
                cauThuLuongThapNhat.add(cauThu);
            }
        }
        return cauThuLuongThapNhat;
    }

    // Phương thức sắp xếp danh sách cầu thủ theo lương thực lãnh giảm dần
    public void sapXepTheoLuongThucLanh() {
        Collections.sort(danhsachCauThu, new Comparator<CauThu>() {
            @Override
            public int compare(CauThu ct1, CauThu ct2) {
                return Double.compare(ct2.tinhLuongThucLanh(), ct1.tinhLuongThucLanh());
            }
        });
        System.out.println("Danh sách cầu thủ đã được sắp xếp theo lương thực lãnh giảm dần.");
    }

    // Phương thức tính độ tuổi trung bình của các cầu thủ
    public double tinhDoTuoiTrungBinh() {
        if (danhsachCauThu.isEmpty()) {
            return 0.0;
        }
        
        int tongTuoi = 0;
        int namHienTai = 2024; // Giả sử năm hiện tại là 2024

        for (CauThu cauThu : danhsachCauThu) {
            tongTuoi += namHienTai - cauThu.getNamsinh();
        }
        
        return (double) tongTuoi / danhsachCauThu.size();
    }
}
    
  
