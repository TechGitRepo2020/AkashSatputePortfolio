package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.nt.bo.BookBO;

public class BookDAOImpl implements IBookDAO {
	
	private static final String INSERT_QUERY="INSERT INTO BOOK_STORE VALUES(BKID_SEQ.NEXTVAL,?,?,?,?)";
		
	private  Connection  getPooledConnection()throws Exception {
		  InitialContext ic=null;
		  DataSource ds=null;
		  Connection con=null;
		  //create InitialContext obj
		  ic=new InitialContext();
		  //get DataSource obj throuhg lookup opeation
		  ds=(DataSource) ic.lookup("java:/comp/env/DsJndi");
		  //get pooled jdbc con object
		  con=ds.getConnection();
		  return con;
	  }
	
	@Override
	public int insertBook(BookBO bo) throws Exception{
	     int count=0;
	     Connection con=getPooledConnection();
	     PreparedStatement ps= con.prepareStatement(INSERT_QUERY);
	     ps.setString(1,bo.getBname());
	     ps.setString(2,bo.getBauthor());
	     ps.setFloat(3,bo.getBprice());
	     ps.setInt(4,bo.getBqty());
	     
	     count=ps.executeUpdate();
	     
	     ps.close();
			con.close();	     
		return count;
	}

}
