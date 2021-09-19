package SINHVIEN;


public class TinB {
	private String MaSv;
	private String HoTen;
	private double Dex;
	private double Dpow;
	private double Dweb;
	public String getMaSv() {
		return MaSv;
	}
	public void setMaSv(String maSv) {
		MaSv = maSv;
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public double getDex() {
		return Dex;
	}
	public void setDex(double dex) {
		Dex = dex;
	}
	public double getDpow() {
		return Dpow;
	}
	public void setDpow(double dpow) {
		Dpow = dpow;
	}
	public double getDweb() {
		return Dweb;
	}
	public void setDweb(double dweb) {
		Dweb = dweb;
	}
	public double getDtb() {
		return (Dex+Dpow+Dweb)/3;
	}
	public void HienThi()
	{
			System.out.println(MaSv+"|"+HoTen+"|"+Dex+"|"+Dpow+"|"+Dweb+"|"+getDtb());
	}
	public String getThongTin()
	{
		return MaSv+"|"+HoTen+"|"+Dex+"|"+Dpow+"|"+Dweb+"|"+getDtb();
	}
}
