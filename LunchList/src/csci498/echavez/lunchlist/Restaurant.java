package csci498.echavez.lunchlist;

public class Restaurant {
	
	private String name = "";
	private String address = "";
	private String type="";
	
	public String getName() {
		return name;
	}
	
	public void setName(String n){
		this.name = n;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String addr){
		this.address = addr;
	}
	
	public String getType(){
		return type;
	}
	
	public void setType(String t){
		this.type =t;  
	}
	
	public String toString(){
		return getName();
	}
}
