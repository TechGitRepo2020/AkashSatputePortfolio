package com.nt.service;

import com.nt.bo.BookBO;
import com.nt.dao.BookDAOImpl;
import com.nt.dao.IBookDAO;
import com.nt.dto.BookDTO;

public class BookServiceImpl implements IBookService {
	private IBookDAO dao;
	
	public BookServiceImpl() {
		dao=new BookDAOImpl();
	}

	@Override
	public String Storebook(BookDTO dto) throws Exception {
		BookBO bo=new BookBO();
		//prepare bo obj
		bo.setBname(dto.getBname());
		bo.setBauthor(dto.getBauthor());
		bo.setBprice(dto.getBprice());
		bo.setBqty(dto.getBqty());
		
		//call dao method
		int count=dao.insertBook(bo);
		return count==0?"Book is not stored":"Book is stored";
	}

}
