package venue;

public class Venue {

	private int venue_id;
	private String name;
	private String phone;
	
	public Venue(int venue_id, String name, String phone) {
		this.venue_id = venue_id;
		this.name = name;
		this.phone = phone;
	}
	
	public Venue(VenueRequestDto venueDto) {
		this.venue_id = venueDto.getVenue_id();
		this.name = venueDto.getName();
		this.phone = venueDto.getPhone();
	}

	public int getVenue_id() {
		return venue_id;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}
	
}
