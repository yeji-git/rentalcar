package Booking;

public class BookingRequestDto {

	private int booking_number;
	private String vehicle_number;
	private String client_id;
	private int venue_id;
	private String dateTime;
	private int hour;
	private int total_payment;
	private String date;
	
	public BookingRequestDto(int booking_number, String vehicle_number, String client_id, int venue_id, String dateTime, int hour, int total_payment, String date) {
		this.booking_number = booking_number;
		this.vehicle_number = vehicle_number;
		this.client_id = client_id;
		this.venue_id = venue_id;
		this.dateTime = dateTime;
		this.hour = hour;
		this.total_payment = total_payment;
		this.date = date;
	}

	public int getBooking_number() {
		return booking_number;
	}

	public void setBooking_number(int booking_number) {
		this.booking_number = booking_number;
	}

	public String getVehicle_number() {
		return vehicle_number;
	}

	public void setVehicle_number(String vehicle_number) {
		this.vehicle_number = vehicle_number;
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public int getVenue_id() {
		return venue_id;
	}

	public void setVenue_id(int venue_id) {
		this.venue_id = venue_id;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getTotal_payment() {
		return total_payment;
	}

	public void setTotal_payment(int total_payment) {
		this.total_payment = total_payment;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
