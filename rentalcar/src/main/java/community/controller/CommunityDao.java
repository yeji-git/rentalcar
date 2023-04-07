package community.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import community.Community;
import community.CommunityRequestDto;
import util.DBManager;

public class CommunityDao {
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private static CommunityDao instance = new CommunityDao();
	
	public static CommunityDao getInstance() {
		return instance;
	}
	
	// C
	public void createCommunity(CommunityRequestDto communityDto) {
		Community community = new Community(communityDto);
		
		this.conn = DBManager.getConnection();
		
		if (this.conn != null) {
			String sql = "INSERT INTO community VALUES";
			sql += "(?,?,?,?,?,?)";
			
			try {
				this.pstmt = this.conn.prepareStatement(sql);
				this.pstmt.setInt(1, community.getText_number());
				this.pstmt.setString(2, community.getClient_id());
				this.pstmt.setString(3, community.getTitle());
				this.pstmt.setString(4, community.getContent());
				this.pstmt.setString(5, community.getWrite_date());
				this.pstmt.setString(6, community.getEdit_date());
				
				this.pstmt.execute();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DBManager.close(conn, pstmt);
			}
		}
	}
	
	// R
	public ArrayList<Community> getCommunityAll() {
		ArrayList<Community> list = new ArrayList<Community>();
		
		this.conn = DBManager.getConnection();
		
		if (this.conn != null) {
			String sql = "SELECT * FROM community";
			
			try {
				this.pstmt = this.conn.prepareStatement(sql);
				this.rs = this.pstmt.executeQuery();
				while (this.rs.next()) {
					int text_number = this.rs.getInt(1);
					String client_id = this.rs.getString(2);
					String title = this.rs.getString(3);
					String content = this.rs.getString(4);
					String write_date = this.rs.getString(5);
					String edit_date = this.rs.getString(6);
					
					Community community = new Community(text_number, client_id, title, content, write_date, edit_date);
					list.add(community);
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
	public void updateCommunity(CommunityRequestDto communityDto) {
		this.conn = DBManager.getConnection();
		
		if (conn != null) {
			String sql = "UPDATE community SET title=?, content=?, edit_date=?";
			
			try {
				this.pstmt = this.conn.prepareStatement(sql);
				this.pstmt.setString(1, communityDto.getTitle());
				this.pstmt.setString(2, communityDto.getContent());
				this.pstmt.setString(3, communityDto.getEdit_date());
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DBManager.close(conn, pstmt);
			}
		}
	}

}
