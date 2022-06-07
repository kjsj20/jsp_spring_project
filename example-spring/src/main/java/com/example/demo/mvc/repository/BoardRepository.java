package com.example.demo.mvc.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.mvc.domain.Board;

/**
 * 게시판 Repository
 * @author 김재성
 */
@Repository
public interface BoardRepository {
	List<Board> getList();
	
	Board get(int boardSeq);
	
	int save(Board board);	
	
	void update(Board board);
	
	void delete(int boardSeq);
}
