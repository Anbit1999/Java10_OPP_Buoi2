package com.cybersoft.java10.main;

import java.util.Arrays;
import java.util.Scanner;

import com.cybersoft.java10.dao.QuanlySinhVien;

import com.cybersoft.java10.object.SinhVien;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		QuanlySinhVien quanlySinhVien = new QuanlySinhVien();
		SinhVien sinhVien = new SinhVien("SV001", "Tuấn", 8.2, 9.8, 10.0);
		SinhVien sinhVien2 = new SinhVien("SV002", "Khoa", 8.2, 9.8, 10.0);
		SinhVien sinhVien3 = new SinhVien("SV003", "Hùng", 6.0, 5.5, 5.25);
		SinhVien sinhVien4 = new SinhVien("SV004", "Mai Anh", 3.0, 2.25, 1.0);
		SinhVien sinhVien5 = new SinhVien("SV005", "Tuấn", 7.2, 6.5, 8.3);
		
		quanlySinhVien.addSinhVien(sinhVien);
		quanlySinhVien.addSinhVien(sinhVien2);
		quanlySinhVien.addSinhVien(sinhVien3);
		quanlySinhVien.addSinhVien(sinhVien4);
		quanlySinhVien.addSinhVien(sinhVien5);
		
		quanlySinhVien.getDssv().forEach(x -> System.out.println(x));
		
		System.out.println("===================================");
		System.out.println("Xếp loại sinh viên");
		quanlySinhVien.xepLoaiSinhVien();
		
		System.out.println("=====================================");
		System.out.println("Danh sách sinh viên có điểm cao nhất");
		
		quanlySinhVien.getSinhVienMaxPoint().forEach(x -> System.out.println(x));
		
		System.out.println("====================================");
		System.out.println("Danh sách sinh viên yếu");
		quanlySinhVien.getListSinhVienYeu().forEach(x -> System.out.println(x));
		
		System.out.println("====================================");
		System.out.println("Tìm sinh viên theo tên sinh viên");
		System.out.print("Nhập tên sinh viên cần tìm: ");
		String studentName = scanner.nextLine();
		if (quanlySinhVien.getListSinhVienbyName(studentName) == null) {
			System.out.println("Không tìm thấy sinh viên cần tìm");
		}else {
			quanlySinhVien.getListSinhVienbyName(studentName).forEach(x -> System.out.println(x));
		}
		
		
		System.out.println("====================================");
		System.out.println("Tìm sinh viên theo mã sinh viên");
		System.out.print("Nhập mã sinh sinh viên cần tìm: ");
		String studentidfind = scanner.nextLine();
		
		if (quanlySinhVien.getSinhVienbyid(studentidfind) == null) {
			System.out.println("Không tìm thấy sinh viên cần tìm");
		}else {
			System.out.println(quanlySinhVien.getSinhVienbyid(studentidfind));
		}
		
		
		System.out.println("====================================");
		System.out.println("Xóa sinh viên theo mã sinh viên");
		
		System.out.print("Nhập mã sinh viên muốn xóa: ");
		String studentidremove = scanner.nextLine();
		if (quanlySinhVien.removeSinhVien(studentidremove)) {
			System.out.println("Đã xóa sinh viên có mã " + studentidremove + " thành công");
		}else {
			System.out.println("Mã sinh viên cần xóa không tồn tại");
		}
		
		System.out.println("Danh sách sinh viên sau khi xóa");
		quanlySinhVien.getDssv().forEach(x -> System.out.println(x));
		
	}
}
