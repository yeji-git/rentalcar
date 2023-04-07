package Booking.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Booking.Booking;
import Booking.BookingRequestDto;
import util.DBManager;

public class BookingDao {
	
	private Connection conn;
	private PreparedStatement  pstmt;
	private ResultSet rs;
	
	private static BookingDao instance = new BookingDao();
	
	public static BookingDao getInstance() {
		return instance;
	}
	
	// C
	public void createBooking(BookingRequestDto bookingDto) {
		Booking booking = new Booking(bookingDto);
		
		this.conn = DBManager.getConnection();
		
		if (this.conn != null) {
			String sql = "INSERT INTO booking VALUES";
			sql += "(?,?,?,?,?,?,?,?)";
			
			try {
				this.pstmt = this.conn.prepareStatement(sql);
				this.pstmt.setInt(1, booking.getBooking_number());
				this.pstmt.setString(2, booking.getVehicle_number());
				this.pstmt.setString(3, booking.getClient_id());
				this.pstmt.setInt(4, booking.getVenue_id());
				this.pstmt.setString(5, booking.getDateTime());
				this.pstmt.setInt(6, booking.getHour());
				this.pstmt.setInt(7, booking.getTotal_payment());
				this.pstmt.setString(8, booking.getDate());
				
				this.pstmt.execute();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DBManager.close(conn, pstmt);
			}
		}
	}
	
	// R
	public ArrayList<Booking> getBookingAll() {
		ArrayList<Booking> list = new ArrayList<Booking>();
		
		this.conn = DBManager.getConnection();
		
		if (this.conn != null) {
			String sql = "SELECT * FROM booking";
			
			try {
				this.pstmt = this.conn.prepareStatement(sql);
				this.rs = this.pstmt.executeQuery();
				while (this.rs.next()) {
					int booking_number = this.rs.getInt(1);
					String vehicle_number = this.rs.getString(2);
					String client_id = this.rs.getString(3);
					int venue_id = this.rs.getInt(4);
					String dateTime = this.rs.getString(5);
					int hour = this.rs.getInt(6);
					int total_payment = this.rs.getInt(7);
					String date = this.rs.getString(8);
					
					Booking booking = new Booking(booking_number, vehicle_number, client_id, venue_id, dateTime, hour, total_payment, date);
					list.add(booking);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DBManager.close(conn, pstmt, rs);
			}
		}
		return list;
	}
	
	// U
	public void updateBooking(BookingRequestDto bookingDto) {
		this.conn = DBManager.getConnection();
		
		if (conn != null) {
			String sql = "UPDATE booking SET booking_num=?, vehicle_num=?, client_id=?, venue_id=?, dateTime=?, hour=?, hotal_payment=?, date=?";
		
			try {
				this.pstmt = this.conn.prepareStatement(sql);
				this.pstmt.setInt(1, bookingDto.getBooking_number());
				this.pstmt.setString(2, bookingDto.getVehicle_number());
				this.pstmt.setString(3, bookingDto.getClient_id());
				this.pstmt.setInt(4, bookingDto.getVenue_id());
				this.pstmt.setString(5, bookingDto.getDateTime());
				this.pstmt.setInt(6, bookingDto.getHour());
				this.pstmt.setInt(7, bookingDto.getTotal_payment());
				this.pstmt.setString(8, bookingDto.getDate());
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DBManager.close(conn, pstmt);
			}
			
		}
	}
	
}
