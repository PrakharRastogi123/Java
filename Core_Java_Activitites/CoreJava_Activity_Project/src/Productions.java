package prakhar;

public class Productions {
	private int Productionid;
	private String Productionname;
	private String Address;
	private String DateofStarted;
	private String Ownername;
	
	
	public Productions() {
		super();
	}


	public Productions(int Productionid, String Productionname, String Address, String dos, String ownername) {
		super();
		this.Productionid=Productionid;
		this.Productionname=Productionname;
		this.Address=Address;
		this.DateofStarted=dos;
		this.Ownername=ownername;
	}
	
	
	
	public int getProductionid() {
		return Productionid;
	}
	public void setProductionid(int productionid) {
		Productionid = productionid;
	}
	public String getProductionname() {
		return Productionname;
	}
	public void setProductionname(String productionname) {
		Productionname = productionname;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getDateofStarted() {
		return DateofStarted;
	}
	public void setDateofStarted(String dateofStarted) {
		DateofStarted = dateofStarted;
	}
	public String getOwnername() {
		return Ownername;
	}
	public void setOwnername(String ownername) {
		Ownername = ownername;
	}
	@Override
	public String toString() {
		return "Productions [Productionid=" + Productionid + ", Productionname=" + Productionname + ", Address="
				+ Address + ", DateofStarted=" + DateofStarted + ", Ownername=" + Ownername + "]";
	}
	
	

}
