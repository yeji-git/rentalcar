package Booking;

public class Booking {

	private int booking_number;
	private String vehicle_number;
	private String client_id;
	private int venue_id;
	private String dateTime;
	private int hour;
	private int total_payment;
	private String date;
	
	public Booking(int booking_number, String vehicle_number, String client_id, int venue_id, String dateTime, int hour, int total_payment, String date) {
		this.booking_number = booking_number;
		this.vehicle_number = vehicle_number;
		this.client_id = client_id;
		this.venue_id = venue_id;
		this.dateTime = dateTime;
		this.hour = hour;
		this.total_payment = total_payment;
		this.date = date;
	}
	
	public Booking(BookingRequestDto bookingDto) {
		this.booking_number = bookingDto.getBooking_number();
		this.vehicle_number = bookingDto.getVehicle_number();
		this.client_id = bookingDto.getClient_id();
		this.venue_id = bookingDto.getVenue_id();
		this.dateTime = bookingDto.getDateTime();
		this.hour = bookingDto.getHour();
		this.total_payment = bookingDto.getTotal_payment();
		this.date = bookingDto.getDate();
	}

	public int getBooking_number() {
		return booking_number;
	}

	public String getVehicle_number() {
		return vehicle_number;
	}

	public String getClient_id() {
		return client_id;
	}

	public int getVenue_id() {
		return venue_id;
	}

	public String getDateTime() {
		return dateTime;
	}

	public int getHour() {
		return hour;
	}

	public int getTotal_payment() {
		return total_payment;
	}

	public String getDate() {
		return date;
	}
	
}
