package com.yehan.web.board.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yehan.web.board.model.BoardDTO;
import com.yehan.web.common.CommonDao;

import lombok.RequiredArgsConstructor;


@Service("boardService")
//@Transactional
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
	
	private final CommonDao commonDao;
	private final String queryId = "board";
	
	public List<?> getBoard(String fileDate){
		// 내부 로직 수행...
		// 내부 로직 수행...
		// 내부 로직 수행...
		// 내부 로직 수행...
		return commonDao.selectList(queryId + ".selectBoard", fileDate);
	}
	
	public Object insertBoard(BoardDTO boardDTO){
		// 내부 로직 수행...
		// 내부 로직 수행...
		// 내부 로직 수행...
		// 내부 로직 수행...
		return commonDao.insert(queryId + ".insertBoard", boardDTO);
	}
	
}
