package bo;


import dao.Xedao;

public class Xe {
	Xedao xd = new Xedao();
	public void getBai1() {
		
		for(Object item: xd.getXe()) {
			System.out.println(item);
		}
		
	}

}
