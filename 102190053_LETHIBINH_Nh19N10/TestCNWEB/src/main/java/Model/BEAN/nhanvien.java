package Model.BEAN;
public class nhanvien {
	private String IDPB;
	private String IDNV;
	private String name;
	private String address;

	public String getIDPB () {
		return IDPB;}
	public void setIDPB (String IDPB) {
		this.IDPB = IDPB;
	}
	public String getIDNV () { 
		return IDNV; }
	
	public void setIDNV (String IDNV) {
		this.IDNV = IDNV;
	}
	public String getName () {
		return name;}
	public void setName (String name) {
		this.name = name;
	}
	public String getAddress () { 
		return address; }
	
	public void setAddress (String address) {
		this.address = address;
	}
}