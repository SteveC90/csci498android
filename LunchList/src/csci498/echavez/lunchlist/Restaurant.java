package csci498.echavez.lunchlist;

public class Restaurant {
	
	private String name = "";
	private String address = "";
	private String type = "";
	private String notes = "";
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String addr) {
		this.address = addr;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String t) {
		this.type = t;  
	}
	
	public String getNotes() {
		return notes;
	}
	
	public void setNotes(String n) {
		this.notes = n;
	}
	
	public String toString() {
		return getName();
	}
	
}
