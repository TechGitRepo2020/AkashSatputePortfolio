package com.nt.dao;

import com.nt.bo.BookBO;

public interface IBookDAO {
  public int insertBook(BookBO bo)throws Exception;
}
