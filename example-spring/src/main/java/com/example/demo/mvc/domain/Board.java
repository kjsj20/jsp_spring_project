package com.example.demo.mvc.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Board {
	private int board_seq;
	private String title;
	private String contents;
	private Date reg_date;	
}
