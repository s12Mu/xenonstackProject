package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.entity.User;

// import java.sql.Connection;
public class User_dao {

	private Connection con;

	public User_dao(Connection con) {
		super();
		this.con = con;
	}
	
	public boolean register(User u)
	{
		boolean status = false;
		
		try {
			String sql = "INSERT INTO `userdetails` (`full_name`, `email`, `password`) values(?,?,?)";
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1,u.getName());
			ps.setString(2,u.getEmail());
			ps.setString(3,u.getPass());
			// ps.setInt(4,u.getPh());
			
			int st = ps.executeUpdate();
			System.out.println("Count :"+st);
			if(st==1)
			{
				status = true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return status;
		
	}
	
	public User login(String pname,String pass) {
		User u = null;
		
		try {
			String sql = "select * from `userdetails` where `full_name`=?, `password`=?";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, pname);
			ps.setString(2, pass);
		
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				u = new User();
				System.out.println(u);
				u.setId(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setEmail(rs.getString(3));
				u.setPass(rs.getString(5));
				//u.setPh(rs.getInt(4));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return u;
	}

}
