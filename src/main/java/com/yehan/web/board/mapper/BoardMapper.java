package com.yehan.web.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yehan.web.board.model.BoardDTO;

//@Repository
@Mapper
public interface BoardMapper {
	List<BoardDTO> getBoard(String fileDate);
	int insertBoard(BoardDTO boardDTO);
}
