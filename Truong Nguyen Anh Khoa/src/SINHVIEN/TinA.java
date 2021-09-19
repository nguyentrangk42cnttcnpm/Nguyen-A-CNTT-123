package SINHVIEN;


public class TinA {
	private String MaSv;
	private String HoTen;
	private double Dwin;
	private double Dword;
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
	public double getDwin() {
		return Dwin;
	}
	public void setDwin(double dwin) {
		Dwin = dwin;
	}
	public double getDword() {
		return Dword;
	}
	public void setDword(double dword) {
		Dword = dword;
	}
	public double getDtb() {
		return (Dwin+Dword)/2;
	}
	public void HienThi()
	{
			System.out.println(MaSv+"|"+HoTen+"|"+Dwin+"|"+Dword+"|"+getDtb());
	}
	public String getThongTin()
	{
		return MaSv+"|"+HoTen+"|"+Dwin+"|"+Dword+"|"+getDtb();
	}
}
