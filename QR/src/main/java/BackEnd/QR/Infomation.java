package BackEnd.QR;

public class Infomation {
	
	private String user_name;
	private String user_id;
	private String user_source;
	private String user_destination;
	private String t_price;
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
	public String getUser_source() {
		return user_source;
	}
	public void setUser_source(String user_source) {
		this.user_source = user_source;
	}
	public String getUser_destination() {
		return user_destination;
	}
	public void setUser_destination(String user_destination) {
		this.user_destination = user_destination;
	}
	public String getT_price() {
		return t_price;
	}
	public void setT_price(String t_price) {
		this.t_price = t_price;
	}
	public Infomation(String user_name, String user_id, String user_source, String user_destination, String t_price) {
		super();
		this.user_name = user_name;
		this.user_id = user_id;
		this.user_source = user_source;
		this.user_destination = user_destination;
		this.t_price = t_price;
	}
	

}
