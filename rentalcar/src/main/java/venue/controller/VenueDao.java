package venue.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import util.DBManager;
import venue.Venue;
import venue.VenueRequestDto;

public class VenueDao {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private static VenueDao instance = new VenueDao();
	
	public static VenueDao getInstance() {
		return instance;
	}
	
	// C
	public void createVenue(VenueRequestDto venueDto) {
		Venue venue = new Venue(venueDto);
		
		this.conn = DBManager.getConnection();
		
		if (this.conn != null) {
			String sql = "INSERT INTO venue VALUES";
			sql += "(?,?,?)";
			
			try {
				this.pstmt = this.conn.prepareStatement(sql);
				this.pstmt.setInt(1, venue.getVenue_id());
				this.pstmt.setString(2, venue.getName());
				this.pstmt.setString(3, venue.getPhone());
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DBManager.close(conn, pstmt);
			}
		}
	}
	
	// R
	public ArrayList<Venue> getVenueAll() {
		ArrayList<Venue> list = new ArrayList<Venue>();
		
		this.conn = DBManager.getConnection();
		
		if (this.conn != null) {
			String sql = "SELECT * FROM venue";
			
			try {
				this.pstmt = this.conn.prepareStatement(sql);
				this.rs = this.pstmt.executeQuery();
				while (this.rs.next()) {
					int venue_id = this.rs.getInt(1);
					String name = this.rs.getString(2);
					String phone = this.rs.getString(3);
					
					Venue venue = new Venue(venue_id, name, phone);
					list.add(venue);
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
	public void updateVenue(VenueRequestDto venueDto) {
		this.conn = DBManager.getConnection();
		
		if (conn != null) {
			String sql = "UPDATE venue SET venue_id=?, name=?, phone=?";
			
			try {
				this.pstmt = this.conn.prepareStatement(sql);
				this.pstmt.setInt(1, venueDto.getVenue_id());
				this.pstmt.setString(2, venueDto.getName());
				this.pstmt.setString(3, venueDto.getPhone());
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DBManager.close(conn, pstmt);
			}
		}
	}
	
}
