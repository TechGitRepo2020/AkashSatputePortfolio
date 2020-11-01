package com.nt.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.dto.BookDTO;
import com.nt.service.BookServiceImpl;
import com.nt.service.IBookService;
import com.nt.vo.BookVO;

@WebServlet("/controller")
public class MainControllerServlet extends HttpServlet {
	private IBookService service;
	
	@Override
	public void init() throws ServletException {
		service=new BookServiceImpl();
	}
	
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//get prrintwriter
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		String bname=req.getParameter("bname");
		String bauthor=req.getParameter("bauthor");
		String bprice=req.getParameter("bprice");
		String bqty=req.getParameter("bqty");
		
		//set to vo obj
		BookVO vo=new BookVO();
		vo.setBname(bname);
		vo.setBauthor(bauthor);
		vo.setBprice(bprice);
		vo.setBqty(bqty);
		
		//convert vo to dto
		BookDTO dto=new BookDTO();
		dto.setBname(vo.getBname());
		dto.setBauthor(vo.getBauthor());
		dto.setBprice(Float.parseFloat(vo.getBprice()));
		dto.setBqty(Integer.parseInt(vo.getBqty()));
		
		try {
			String result=service.Storebook(dto);
			pw.println("<h1 style='color:red;text-align:center'>"+result+"</h1>");
		}
		catch (Exception e) {
			e.printStackTrace();
			pw.println("<h1 style='color:red;text-align:center'>Internal problem-- try again!!</h1>");
		}
		pw.println("<a href='index.html'>home</a>");
		
		pw.close();
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}
	
	@Override
	public void destroy() {
		service=null;
	}
}
