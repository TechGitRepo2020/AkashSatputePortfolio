package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/secondurl")
public class SecondServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException 
	{
		PrintWriter pw=null;
		String skill=null;
		String exp=null;
		HttpSession hs=null;
		//
		pw=res.getWriter();
		res.setContentType("text/html");
		//
		
		exp=req.getParameter("exp");
		skill=req.getParameter("skill");
		//
		hs=req.getSession(false);
		//
		hs.setAttribute("exp", exp);
		hs.setAttribute("skill", skill);
		//
		
		pw.println("<body bgcolor='cyan'>");
		pw.println("<form action='thirdurl' method='post'>");
		
		pw.println("<h1>Provide ExpSal and prefered location</h1>");
		pw.println("ExpSal::<input type='text' name='expsal'><br>");
		pw.println("Prefered Location::<input type='text' name='location'><br>");
		pw.println("<input type='submit' value='submit'><br>");
		
		pw.println("</form>");
		pw.println("</body>");

		
		
		//
		pw.println("<b>Session id::"+hs.getId()+"<br>");	
		pw.close();
		
	}

	
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		doGet(req, res);
	}
}
