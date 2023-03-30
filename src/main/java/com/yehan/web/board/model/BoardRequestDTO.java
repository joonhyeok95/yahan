package com.yehan.web.board.model;

import java.util.Arrays;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardRequestDTO {
	private String no;
	private String userId;
	private String title;
	private String content;
	private String fileDate;
	private MultipartFile[] multiFiles;
}
