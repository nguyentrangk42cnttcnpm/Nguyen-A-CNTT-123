package bean;

public class ThongTinXebean {
	protected String bienso;
	protected String socmnd;
	protected String hoten;
	protected boolean gioitinh;
	protected String mach;
	protected String hangsx;
	protected String mauson;
	public ThongTinXebean(String bienso, String socmnd, String hoten, boolean gioitinh, String mach, String hangsx, String mauson) {
		// TODO Auto-generated constructor stub
		super();
		this.bienso = bienso;
		this.socmnd = socmnd;
		this.hoten = hoten;
		this.gioitinh = gioitinh;
		this.mach = mach;
		this.hangsx = hangsx;
		this.mauson = mauson;
	}
	public String getBienso() {
		return bienso;
	}
	public void setBienso(String bienso) {
		this.bienso = bienso;
	}
	public String getSocmnd() {
		return socmnd;
	}
	public void setSocmnd(String socmnd) {
		this.socmnd = socmnd;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public boolean isGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(boolean gioitinh) {
		this.gioitinh = gioitinh;
	}
	public String getMach() {
		return mach;
	}
	public void setMach(String mach) {
		this.mach = mach;
	}
	public String getHangsx() {
		return hangsx;
	}
	public void setHangsx(String hangsx) {
		this.hangsx = hangsx;
	}
	public String getMauson() {
		return mauson;
	}
	public void setMauson(String mauson) {
		this.mauson = mauson;
	}
	

}
