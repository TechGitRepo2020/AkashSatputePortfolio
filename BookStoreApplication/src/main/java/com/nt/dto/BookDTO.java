package com.nt.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class BookDTO implements Serializable {
	private String bname;
	private String bauthor;
	private Float bprice;
	private Integer bqty;	

}
