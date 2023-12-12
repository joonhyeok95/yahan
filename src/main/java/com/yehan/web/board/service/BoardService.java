package com.yehan.web.board.service;

import java.util.List;

import com.yehan.web.board.model.BoardDTO;

public interface BoardService {
	List<?> getBoard(String fileDate);
	Object insertBoard(BoardDTO boardDTO);
}
