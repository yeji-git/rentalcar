package client;

public class ClientRequestDto {

	private String client_id;
	private String password;
	private String name;
	private String phone;
	private String address;

	public ClientRequestDto(String client_id, String password, String name, String phone, String address) {
		this.client_id = client_id;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
