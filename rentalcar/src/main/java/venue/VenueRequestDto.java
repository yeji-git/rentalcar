package venue;

public class VenueRequestDto {

	private int venue_id;
	private String name;
	private String phone;
	
	public VenueRequestDto(int venue_id, String name, String phone) {
		this.venue_id = venue_id;
		this.name = name;
		this.phone = phone;
	}

	public int getVenue_id() {
		return venue_id;
	}

	public void setVenue_id(int venue_id) {
		this.venue_id = venue_id;
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
	
}
