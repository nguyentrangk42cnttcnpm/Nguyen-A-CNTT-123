package bean;

import java.util.Date;

public class NhanVienBean {
	private String Manv;
	private String Hoten;
	private Boolean gioitinh;
	private Date Ngaysinh;
	private Double Hsl;
	private String MaDv;
	public String getManv() {
		return Manv;
	}
	public void setManv(String manv) {
		Manv = manv;
	}
	public String getHoten() {
		return Hoten;
	}
	public void setHoten(String hoten) {
		Hoten = hoten;
	}
	public Boolean getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(Boolean gioitinh) {
		this.gioitinh = gioitinh;
	}
	public Date getNgaysinh() {
		return Ngaysinh;
	}
	public void setNgaysinh(Date ngaysinh) {
		Ngaysinh = ngaysinh;
	}
	public Double getHsl() {
		return Hsl;
	}
	public void setHsl(Double hsl) {
		Hsl = hsl;
	}
	public String getMaDv() {
		return MaDv;
	}
	public void setMaDv(String maDv) {
		MaDv = maDv;
	}
	public NhanVienBean(String manv, String hoten, Boolean gioitinh, Date ngaysinh, Double hsl, String maDv) {
		super();
		Manv = manv;
		Hoten = hoten;
		this.gioitinh = gioitinh;
		Ngaysinh = ngaysinh;
		Hsl = hsl;
		MaDv = maDv;
	}
	public NhanVienBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
