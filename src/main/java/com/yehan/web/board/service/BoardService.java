package com.yehan.web.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yehan.web.board.mapper.BoardMapper;
import com.yehan.web.board.model.BoardDTO;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class BoardService {
	
	private final BoardMapper boardMapper;
	
	public List<BoardDTO> getBoard(String fileDate){
		return boardMapper.getBoard(fileDate);
	}
	
	public int insertBoard(BoardDTO boardDTO){
		return boardMapper.insertBoard(boardDTO);
	}
	
}
