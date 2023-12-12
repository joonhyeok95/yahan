package com.yehan.web.file.web;


import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yehan.web.util.MediaUtils;

@RestController
public class FileDownloadController {
	
	@Value("${file.download.directory}") 
	private String fileDownloadDirectory;
    // 로컬 사진 불러오기
    // G:/workspace/연도/파일이름
    @RequestMapping(value = "/download-file/{year}/{filename}", method = RequestMethod.GET)
    public ResponseEntity<byte[]> downloadFile(@PathVariable String filename, @PathVariable String year) throws Exception {
    	// Load file as Resource 
        String path = fileDownloadDirectory + year +"/"+ filename;
        InputStream in = null;
        ResponseEntity<byte[]> entity = null;
        try {
        	String format = filename.substring(filename.lastIndexOf(".")+1);
        	MediaType type = MediaUtils.getMediaType(format);
        	org.springframework.http.HttpHeaders header = new org.springframework.http.HttpHeaders();
        	in = new FileInputStream(path);
        	
        	if(type != null) {
            	// 사진일 경우
        		header.setContentType(type);
        	} else {
        		// 사진이 아닐 경우
        		header.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        		header.add("Content-Disposition", "attachment; filename=\"" + new String(filename.getBytes("UTF-8"), "ISO-8859-1"));
        	}
        	entity = new ResponseEntity<byte[]>(IOUtils.toByteArray(in), header, HttpStatus.CREATED);
        	in.close();
        } catch (Exception e) {
			// TODO: handle exception
        	entity = new ResponseEntity<byte[]>(HttpStatus.BAD_REQUEST);
		} finally {
			in.close();
		}
        
        return entity;
    }
}

