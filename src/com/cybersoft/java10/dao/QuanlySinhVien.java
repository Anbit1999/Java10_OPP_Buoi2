package com.cybersoft.java10.dao;

import java.util.ArrayList;
import java.util.List;

import com.cybersoft.java10.object.SinhVien;

public class QuanlySinhVien {
	private List<SinhVien> dssv;

	public QuanlySinhVien() {
		dssv = new ArrayList<SinhVien>();
	}

	public boolean addSinhVien(SinhVien sv) {
		if (dssv.contains(sv)) {
			return false;
		}
		dssv.add(sv);
		return true;
	}
	
	public boolean removeSinhVien(String id) {
		for(SinhVien sv: dssv) {
			if (sv.getMaSinhVien().equalsIgnoreCase(id)) {
				dssv.remove(sv);
				return true;
			}
		}
		return false;
	}

	/**
	 * @return the dssv
	 */
	public List<SinhVien> getDssv() {
		return dssv;
	}

	public double getdtbSinhVien(String maSinhVien) {
		SinhVien sinhVien = new SinhVien(maSinhVien);
		double result = 0;
		result = (sinhVien.getDiemToan() + sinhVien.getDiemLy() + sinhVien.getDiemHoa())/3;
		return result;
	}

	public void xepLoaiSinhVien() {
		for(SinhVien sv: dssv) {
			if (sv.getdtb() >= 9) {
				System.out.println(sv.getTenSinhVien() + "\tXếp loại: Xuất Sắc");
			}else if (sv.getdtb() < 9 && sv.getdtb() >= 8) {
				System.out.println(sv.getTenSinhVien() + "\tXếp loại: Giỏi");
			}else if (sv.getdtb() < 8 && sv.getdtb() >= 7) {
				System.out.println(sv.getTenSinhVien() + "\tXếp loại: Khá");
			}else if (sv.getdtb() < 7 && sv.getdtb() >= 6) {
				System.out.println(sv.getTenSinhVien() + "\tXếp loại: TB Khá");
			}else if (sv.getdtb() < 6 && sv.getdtb() >= 5) {
				System.out.println(sv.getTenSinhVien() + "\tXếp loại: TB");
			}else {
				System.out.println(sv.getTenSinhVien() + "\tXếp loại: Yếu");
			}
		}
	}

	public List<SinhVien> getSinhVienMaxPoint() {

		SinhVien svMax = new SinhVien();
		List<SinhVien> dsSinhVienMax = new ArrayList<SinhVien>();
		for(SinhVien sv : dssv) {
			if (sv.getdtb() >= svMax.getdtb()) {
				svMax = sv;
				if (sv.getdtb() == svMax.getdtb()) {
					dsSinhVienMax.add(svMax);
				}
			}
		}
		return dsSinhVienMax;
	}

	public List<SinhVien> getListSinhVienYeu() {

		List<SinhVien> listYeu = new ArrayList<SinhVien>();
		for(SinhVien sv : dssv) {
			if (sv.getdtb() < 5) {
				listYeu.add(sv);
			}
		}
		return listYeu;
	}
	
	public List<SinhVien> getListSinhVienbyName(String name) {

		List<SinhVien> listsv = new ArrayList<SinhVien>();
		for(SinhVien sv : dssv) {
			if (sv.getTenSinhVien().equalsIgnoreCase(name)) {
				listsv.add(sv);
			}else {
				listsv = null;
			}
		}
		return listsv;
	}
	
	public SinhVien getSinhVienbyid(String id) {
		
		SinhVien sinhVien = new SinhVien();
		for(SinhVien sv : dssv) {
			if (sv.getMaSinhVien().equals(id)) {
				sinhVien = sv;
			}else {
				sinhVien = null;
			}
		}
		
		return sinhVien;
		
	}
}
