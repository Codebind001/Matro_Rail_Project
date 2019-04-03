package Bean;

public class User_Bean {
	
	private String iduser;
	private String first_name;
	private String last_name;
	private String email;
	private String mb_number;
	private String password;
	private String mc_number;
	private String account_balance;

	public void setAccount_balance(String account_balance) {
		this.account_balance = account_balance;
	}
	public String getAccount_balance() {
		return account_balance;
	}
	
	public void setId(String id) {
		this.iduser = id;
	}
	public String getId() {
		return iduser;
	}
	
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getFirst_name() {
		return first_name;
	}
	
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getLast_name() {
		return last_name;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}

	public void setMb_number(String mb_number) {
		this.mb_number = mb_number;
	}
	public String getMb_number() {
		return mb_number;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}

	public void setMc_number(String mc_number) {
		this.mc_number = mc_number;
	}
	public String getMc_number() {
		return mc_number;
	}

	
	

}
