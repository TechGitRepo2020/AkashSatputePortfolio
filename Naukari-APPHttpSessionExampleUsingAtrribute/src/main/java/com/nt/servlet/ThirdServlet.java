package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

@WebServlet("/thirdurl")
public class ThirdServlet extends HttpServlet {
	
	public static final String INSERT_QUERY="INSERT INTO NAUKARI_INFO VALUES(JSID_SEQ.NEXTVAL,?,?,?,?,?,?,?)"; 
	
	@Resource(name="DsJndi")
	DataSource ds=null;
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException 
	{
		PrintWriter pw=null;
		String location=null;
		int expsal=0;
		int count=0;
		Connection con=null;
		PreparedStatement ps=null;
		HttpSession hs=null;
		//
		pw=res.getWriter();
		res.setContentType("text/html");
		//
		
		expsal=Integer.parseInt(req.getParameter("expsal"));
		location=req.getParameter("location");
		//
		hs=req.getSession(false);
		//
		 String name=(String)hs.getAttribute("name");
		 String addrs=(String)hs.getAttribute("addrs");
		 int age=(int) hs.getAttribute("age");
		 String exp=(String) hs.getAttribute("exp");
		 String skill=(String)hs.getAttribute("skill");
		 		 
		//
		 try
		 {
			 con=ds.getConnection();
			 ps=con.prepareStatement(INSERT_QUERY);
			 ps.setString(1,name);
			 ps.setString(2,addrs);
			 ps.setInt(3,age);
			 ps.setString(4,exp);
			 ps.setString(5,skill);
			 ps.setInt(6,expsal);
			 ps.setString(7,location);
			 
			 count=ps.executeUpdate();
			 
			 if(count>0)
			 {
			    pw.println("<h1 style='color:blue'>Registration Sucess</h1>");
			    
			 }
			 else
			 {
				 pw.println("<h1 style='color:green'>Registration failed</h1>");
			 }
			 
			 pw.println("<b>form1/req1 data::"+name+"..."+addrs+"..."+age+"<br>");
			 pw.println("<b>form2/req2 data::"+exp+"..."+skill+"<br>");
			 pw.println("<b>form3/req3 data::"+expsal+"..."+location+"<br>");
				
							 
			 //
				pw.println("<b>Session id::"+hs.getId()+"<br>");	
				
				
					 
		 }catch(SQLException se)
		 {
			 se.printStackTrace();
			 pw.println("<h1 style='color:green'>Registration failed</h1>");
			 
		 }
		 catch (Exception e)
		 {
			 e.printStackTrace();
			 pw.println("<h1 style='color:Black'>internal DB problem</h1>");
		 }
		 finally
		 {
			 //
			 hs.invalidate();
			 
			 //
			 try
			 {
				 if(ps!=null)
				 {
					 ps.close();
				 }
				 
				 
			 }catch(Exception e)
			 {
				 e.printStackTrace();
			 }
			 
			 try
			 {
				 if(con!=null)
				 {
					 con.close();
				 }
				 
				 
			 }catch(Exception e)
			 {
				 e.printStackTrace();
			 }
			 
		 }//finally
		 
		 
			pw.println("<a href='input.html'>HOME</a>");	
		 pw.close();		
		
		
	}

	
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		doGet(req, res);
	}
}
