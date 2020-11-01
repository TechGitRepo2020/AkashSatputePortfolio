package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/firsturl")
public class FirstServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException 
	{
		PrintWriter pw=null;
		String name=null,addrs=null;
		int age=0;
		HttpSession hs=null;
		//
		pw=res.getWriter();
		res.setContentType("text/html");
		//
		name=req.getParameter("name");
		addrs=req.getParameter("addrs");
		age=Integer.parseInt(req.getParameter("age"));
		//
		hs=req.getSession();
		//
		hs.setAttribute("name", name);
		hs.setAttribute("addrs", addrs);
		hs.setAttribute("age", age);
		
		//
		
		pw.println("<body bgcolor='cyan'>");
		pw.println("<form action='secondurl' method='post'>");
		
		pw.println("<h1>Provide Experience and Skills</h1>");
		pw.println("Experience::<input type='text' name='exp'><br>");
		
		pw.println("Skills::<select value='skill' name='skill'><br>");
		pw.println("<option value=''>select</option><br>");
		
		pw.println("<option value='IT'>IT Services</option><br>");
		pw.println("<option value='healthcare'>Health Care</option><br>");
		pw.println("<option value='agro'>Agriculture</option><br>");
		
		pw.println("</select><br>");
		pw.println("<input type='submit' value='continue'><br>");
		
		
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
