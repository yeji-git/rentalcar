package client;

public class Client {

	private String client_id;
	private String password;
	private String name;
	private String phone;
	private String address;
	
	public Client(String client_id, String password, String name, String phone, String address) {
		this.client_id = client_id;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
	public String getClient_id() {
		return client_id;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	
}
