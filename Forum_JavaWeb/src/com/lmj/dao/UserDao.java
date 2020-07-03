package com.lmj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.junit.Test;

import com.lmj.model.User;
import com.lmj.util.MySqlUtil;

public class UserDao {

	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public User FindUserId(User user) {
//		con = MySqlUtil.GetConnection();
//		String sql = "Select * From user where username=? and password = ?";
//
//		try {
//			ps = con.prepareStatement(sql);
//			ps.setString(1, user.username);
//			ps.setString(2, user.password);
//
//			rs = ps.executeQuery();
//			if (rs.next()) {
//				return true;
//			} else {
//				return false;
//			}
//
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			MySqlUtil.close(con, ps, rs);//ʹ��QueryRunner,���ùر�
//		}
//		return false;
		
		QueryRunner runner = new QueryRunner(MySqlUtil.GetDataSource());
		String sql = "Select * From user where username=? and password = ?";
		User temp = null;
		try {
			temp = runner.query(sql, new BeanHandler<User>(User.class),user.getUsername(),user.getPassword());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}
	public User FindUser(String username) {
		QueryRunner runner = new QueryRunner(MySqlUtil.GetDataSource());
		String sql = "Select * From user where username=?";
		User temp = null;
		try {
			temp = runner.query(sql, new BeanHandler<User>(User.class),username);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}
	public User FindUsername(Integer id) {
		QueryRunner runner = new QueryRunner(MySqlUtil.GetDataSource());
		String sql = "Select * From user where id=?";
		User temp = null;
		try {
			temp = runner.query(sql, new BeanHandler<User>(User.class),id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}
	
	public int InsertUser(User user) {
//		con = MySqlUtil.GetConnection();
//		String sql = "insert into user(username,password,phonenum) value(?,?,?)";
//
//		try {
//			ps = con.prepareStatement(sql);
//			ps.setString(1, user.username);
//			ps.setString(2, user.password);
//			ps.setString(3, user.phonenum);
//
//			int temp = ps.executeUpdate();
//			if (temp!=0) {
//				return true;
//			} else {
//				return false;
//			}
//
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			MySqlUtil.close(con, ps, rs);
//		}
//		return false;
		
		QueryRunner runner = new QueryRunner(MySqlUtil.GetDataSource());
		String sql = "insert into user(username,password,phonenum) value(?,?,?)";
		int temp = 0;
		try {
			temp = runner.update(sql, user.getUsername(),user.getPassword(),user.getPhonenum());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}
	
	public int UpdateUser(User user) {
//		con = MySqlUtil.GetConnection();
//		String sql = "Update User set password = ? where username = ? and phonenum = ?";
//
//		try {
//			ps = con.prepareStatement(sql);
//			ps.setString(1, user.password);
//			ps.setString(2, user.username);
//			ps.setString(3, user.phonenum);
//
//			int temp = ps.executeUpdate();
//			if (temp!=0) {
//				return true;
//			} else {
//				return false;
//			}
//
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			MySqlUtil.close(con, ps, rs);
//		}
//		return false;
		
		QueryRunner runner = new QueryRunner(MySqlUtil.GetDataSource());
		String sql = "Update User set password = ? where username = ? and phonenum = ?";
		int temp = 0;
		try {
			temp = runner.update(sql, user.getPassword(),user.getUsername(),user.getPhonenum());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}
}