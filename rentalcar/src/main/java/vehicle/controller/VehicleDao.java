package vehicle.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import util.DBManager;
import vehicle.Vehicle;
import vehicle.VehicleRequestDto;

public class VehicleDao {
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private static VehicleDao instance = new VehicleDao();
	
	public static VehicleDao getInstance() {
		return instance;
	}
	
	// C
	public void createVehicle(VehicleRequestDto vehicleDto) {
		Vehicle vehicle = new Vehicle(vehicleDto);
		
		this.conn = DBManager.getConnection();
		
		if (this.conn != null) {
			String sql = "INSERT INTO vehicle VLUES";
			sql += "(?,?,?,?,?)";
			
			try {
				this.pstmt = this.conn.prepareStatement(sql);
				this.pstmt.setString(1, vehicle.getVehicle_number());
				this.pstmt.setInt(2, vehicle.getVenue_id());
				this.pstmt.setString(3, vehicle.getCompany());
				this.pstmt.setString(4, vehicle.getType());
				this.pstmt.setString(5, vehicle.getPeriod());
				
				this.pstmt.execute();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DBManager.close(conn, pstmt);
			}
		}
	}
	
	// R
	public ArrayList<Vehicle> getVehicleAll() {
		ArrayList<Vehicle> list = new ArrayList<Vehicle>();
		
		this.conn = DBManager.getConnection();
		
		if (this.conn != null) {
			String sql = "SELECT * FROM vehicle";
			
			try {
				this.pstmt = this.conn.prepareStatement(sql);
				this.rs = this.pstmt.executeQuery();
				while (this.rs.next()) {
					String vehicle_number = this.rs.getString(1);
					int venue_id = this.rs.getInt(2);
					String company = this.rs.getString(3);
					String type = this.rs.getString(4);
					String period = this.rs.getString(5);
					
					Vehicle vehicle = new Vehicle(vehicle_number, venue_id, company, type, period);
					list.add(vehicle);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				DBManager.close(conn, pstmt, rs);
			}
		}
		
		return list;
	}
	
	// U
	public void updateVehicle(VehicleRequestDto vehicleDto) {
		this.conn = DBManager.getConnection();
		
		if (conn != null) {
			String sql = "UPDATE vehicle SET vehicle_number=?, venue_id=?, company=?, type=?, period=?";
			
			try {
				this.pstmt = this.conn.prepareStatement(sql);
				this.pstmt.setString(1, vehicleDto.getVehicle_number());
				this.pstmt.setInt(2, vehicleDto.getVenue_id());
				this.pstmt.setString(3, vehicleDto.getCompany());
				this.pstmt.setString(4, vehicleDto.getType());
				this.pstmt.setString(5, vehicleDto.getPeriod());
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DBManager.close(conn, pstmt);
			}
		}
	}
}
