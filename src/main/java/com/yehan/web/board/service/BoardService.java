package com.yehan.web.board.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yehan.web.board.mapper.BoardMapper;
import com.yehan.web.board.model.BoardDTO;

import lombok.RequiredArgsConstructor;


@Service
@Transactional
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
