package com.yehan.web.board.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class BoardDTO {
	private String no;
	private String userId;
	private String date;
	private String title;
	private String content;
	private String fileId;
	private String fileName;
	private String fileDate;
	
	private String url;
}
