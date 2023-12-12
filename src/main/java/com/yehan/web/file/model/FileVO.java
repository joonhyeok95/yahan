package com.yehan.web.file.model;

import java.util.Arrays;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FileVO {
	String name;
	String filename;
	String url;
	String content;
	String year;
	MultipartFile[] multiFiles;
	@Override
	public String toString() {
		return "FileVO [name=" + name + ", filename=" + filename + ", url=" + url + ", content=" + content
				+ ", multiFiles=" + Arrays.toString(multiFiles) + "]";
	}
}
