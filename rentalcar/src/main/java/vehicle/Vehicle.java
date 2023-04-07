package vehicle;

public class Vehicle {
	
	private String vehicle_number;
	private int venue_id;
	private String company;
	private String type;
	private String period;
	
	public Vehicle(String vehicle_number, int venue_id, String company, String type, String period) {
		this.vehicle_number = vehicle_number;
		this.venue_id = venue_id;
		this.company = company;
		this.type = type;
		this.period = period;
	}
	
	public Vehicle(VehicleRequestDto vehicleDto) {
		this.vehicle_number = vehicleDto.getVehicle_number();
		this.venue_id = vehicleDto.getVenue_id();
		this.company = vehicleDto.getCompany();
		this.type = vehicleDto.getType();
		this.period = vehicleDto.getPeriod();
	}

	public String getVehicle_number() {
		return vehicle_number;
	}

	public int getVenue_id() {
		return venue_id;
	}

	public String getCompany() {
		return company;
	}

	public String getType() {
		return type;
	}

	public String getPeriod() {
		return period;
	}
	
}
