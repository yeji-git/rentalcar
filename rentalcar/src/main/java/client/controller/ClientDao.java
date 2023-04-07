package client.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import client.Client;
import client.ClientRequestDto;
import util.DBManager;

public class ClientDao {
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private static ClientDao instance = new ClientDao();
	
	public static ClientDao getInstance() {
		return instance;
	}
	
	// C
	public void createClient(ClientRequestDto clientDto) {
		Client client = new Client(clientDto);
		
		this.conn = DBManager.getConnection();
		
		if (this.conn != null) {
			String sql = "INSERT INTO `client` VALUES";
			sql += "(?,?,?,?,?)";
			
			try {
				this.pstmt = this.conn.prepareStatement(sql);
				this.pstmt.setString(1, client.getClient_id());
				this.pstmt.setString(2, client.getPassword());
				this.pstmt.setString(3, client.getName());
				this.pstmt.setString(4, client.getPhone());
				this.pstmt.setString(5, client.getAddress());
				
				this.pstmt.execute();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				DBManager.close(conn, pstmt);
			}
		}
	}

	// R
	public ArrayList<Client> getClientAll() {
		ArrayList<Client> list = new ArrayList<Client>();
		
		this.conn = DBManager.getConnection();
		
		if (this.conn != null) {
			String sql = "SELECT * FROM client";
			
			try {
				this.pstmt = this.conn.prepareStatement(sql);
				this.rs = this.pstmt.executeQuery();
				while (this.rs.next()) {
					String client_id = this.rs.getString(1);
					String password = this.rs.getString(2);
					String name = this.rs.getString(3);
					String phone = this.rs.getString(4);
					String address = this.rs.getString(5);
					
					Client client = new Client(client_id, password, name, phone, address);
					list.add(client);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				DBManager.close(conn, pstmt, rs);
			}
		}
		return list;
	}
	
	public Client getClientById(String client_id) {
		Client client = null;
		
		this.conn = DBManager.getConnection();
		if (this.conn != null) {
			try {
				String sql = "SELECT * FROM client WHERE client_id=?";
				this.pstmt = conn.prepareStatement(sql);
				this.pstmt.setString(1, client_id);
				this.rs = this.pstmt.executeQuery();
				while (this.rs.next()) {
//					String client_id = this.rs.getString(1);
					String password = this.rs.getString(2);
					String name = this.rs.getString(3);
					String phone = this.rs.getString(4);
					String address = this.rs.getString(5);
					
					client = new Client(client_id, password, name, phone, address);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DBManager.close(conn, pstmt, rs);
			}
		}
		return client;
	}
	
	// U
	public void updateClient(ClientRequestDto clientDto) {
		this.conn = DBManager.getConnection();
		
		if (conn != null) {
			String sql = "UPDATE client SET password=?, name=?, phone=?, address=?";
			
			try {
				this.pstmt = this.conn.prepareStatement(sql);
				this.pstmt.setString(1, clientDto.getPassword());
				this.pstmt.setString(2, clientDto.getName());
				this.pstmt.setString(3, clientDto.getPhone());
				this.pstmt.setString(4, clientDto.getAddress());
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				DBManager.close(conn, pstmt);
			}
		}
	}
}
