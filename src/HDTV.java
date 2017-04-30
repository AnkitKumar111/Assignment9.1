/* program to create a class HDTV */

public class HDTV {
	//properties
	private String Brandname;
	int size;
	//constructor to initialize variable
	public HDTV(String Brandname, int size) {
		this.Brandname = Brandname;
		this.size = size;
	}
	//methods
	public String getBrandname() {
		return Brandname;
	}
	public void setBrandname(String Brandname) {
		this.Brandname = Brandname;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

}