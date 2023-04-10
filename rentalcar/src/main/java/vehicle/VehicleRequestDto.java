package vehicle;

public class VehicleRequestDto {

	private String vehicle_number;
	private int venue_id;
	private String company;
	private String type;
	private String period;
	private int money;
	
	public VehicleRequestDto(String vehicle_number, int venue_id, String company, String type, String period, int money) {
		this.vehicle_number = vehicle_number;
		this.venue_id = venue_id;
		this.company = company;
		this.type = type;
		this.period = period;
		this.money = money;
	}

	public String getVehicle_number() {
		return vehicle_number;
	}

	public void setVehicle_number(String vehicle_number) {
		this.vehicle_number = vehicle_number;
	}

	public int getVenue_id() {
		return venue_id;
	}

	public void setVenue_id(int venue_id) {
		this.venue_id = venue_id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}
