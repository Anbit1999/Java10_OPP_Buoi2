package com.cybersoft.java10.object;

public class SinhVien {
	private String maSinhVien;
	private String tenSinhVien;
	private double diemToan;
	private double diemLy;
	private double diemHoa;
	private double dtb;
	/**
	 * @param maSinhVien
	 * @param tenSinhVien
	 * @param diemToan
	 * @param diemLy
	 * @param diemHoa
	 */
	public SinhVien(String maSinhVien, String tenSinhVien, double diemToan, double diemLy, double diemHoa) {
		super();
		this.maSinhVien = maSinhVien;
		this.tenSinhVien = tenSinhVien;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}
	/**
	 * 
	 */
	public SinhVien() {
		super();
	}
	/**
	 * @return the maSinhVien
	 */
	public String getMaSinhVien() {
		return maSinhVien;
	}
	
	
	/**
	 * @param maSinhVien
	 */
	public SinhVien(String maSinhVien) {
		super();
		this.maSinhVien = maSinhVien;
	}
	/**
	 * @param maSinhVien the maSinhVien to set
	 */
	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	/**
	 * @return the tenSinhVien
	 */
	public String getTenSinhVien() {
		return tenSinhVien;
	}
	/**
	 * @param tenSinhVien the tenSinhVien to set
	 */
	public void setTenSinhVien(String tenSinhVien) {
		this.tenSinhVien = tenSinhVien;
	}
	/**
	 * @return the diemToan
	 */
	public double getDiemToan() {
		return diemToan;
	}
	/**
	 * @param diemToan the diemToan to set
	 */
	public void setDiemToan(double diemToan) {
		this.diemToan = diemToan;
	}
	/**
	 * @return the diemLy
	 */
	public double getDiemLy() {
		return diemLy;
	}
	/**
	 * @param diemLy the diemLy to set
	 */
	public void setDiemLy(double diemLy) {
		this.diemLy = diemLy;
	}
	/**
	 * @return the diemHoa
	 */
	public double getDiemHoa() {
		return diemHoa;
	}
	/**
	 * @param diemHoa the diemHoa to set
	 */
	public void setDiemHoa(double diemHoa) {
		this.diemHoa = diemHoa;
	}
	
	public double getdtb() {
		double dtb = (this.diemToan + this.diemLy + this.diemHoa) / 3;
		return dtb;
	}
	@Override
	public String toString() {
		return "SinhVien [maSinhVien=" + maSinhVien + ", tenSinhVien=" + tenSinhVien + ", diemToan=" + diemToan
				+ ", diemLy=" + diemLy + ", diemHoa=" + diemHoa + ", Diem trung binh=" + getdtb() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maSinhVien == null) ? 0 : maSinhVien.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		if (maSinhVien == null) {
			if (other.maSinhVien != null)
				return false;
		} else if (!maSinhVien.equalsIgnoreCase(other.maSinhVien))
			return false;
		return true;
	}
	
	
	
}
