package bean;

public abstract class ChiTietbean {
	protected int loaixe;
	protected String tgianvao;
	protected String tgianra;
	protected float tienthue;
	public ChiTietbean(int loaixe, String tgianvao, String tgianra, float tienthue) {
		// TODO Auto-generated constructor stub
		this.loaixe = loaixe;
		this.tgianvao = tgianvao;
		this.tgianra = tgianra;
		this.tienthue = tienthue;
	}
	public abstract String getChiTiet();
		
}
