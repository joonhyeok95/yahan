package com.yehan.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.yehan.web.model.SalaryModel;
import com.yehan.web.service.SalaryService;
import com.yehan.web.util.Thumbnail;
import com.yehan.web.vo.FileVO;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MyApiController {

	private final SalaryService salaryService;
	private final Thumbnail thumbnail = new Thumbnail();

	@Value("${file.download.directory}") 
	private String fileDownloadDirectory;
	
    @RequestMapping(value = "/api",method = RequestMethod.GET)
    public String api(Model model, String year){
		List<SalaryModel> salaryList = salaryService.getSalary();
    	
    	return salaryList.toString();
    }
    
    // 썸네일 만들기.
    @RequestMapping(value = "/img",method = RequestMethod.GET)
    public ModelAndView img(Model model) throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("img");
	    // 썸네일
	    //BufferedImage srcImg = ImageIO.read(new File(fileDownloadDirectory + "/test/img.jpg"));
	    //BufferedImage destImg = Scalr.resize(srcImg, Scalr.Method.AUTOMATIC, Scalr.Mode.FIT_TO_HEIGHT, 200, Scalr.OP_ANTIALIAS);
	    //File thumbFile = new File(fileDownloadDirectory + "/test/img_crop.jpg");
	    //ImageIO.write(destImg, "jpg", thumbFile);
	    for(int i=1; i<5; i++)
	    	thumbnail.makeThumbnail(fileDownloadDirectory + "/test/", "cat"+i+".jpg", "jpg");

	    // 파일출력하기
        ArrayList<FileVO> dataList = new ArrayList<FileVO>();
        for(int i=1; i<5; i++) {
	        FileVO fileVO = new FileVO();
	        fileVO.setFilename("test"+i);
	        fileVO.setName("test"+i);
	        fileVO.setUrl("/download-file/test/THUMB_cat"+i+".jpg");
	        fileVO.setContent("test");
	        dataList.add(fileVO);
        }
		model.addAttribute("dataList", dataList);
        model.addAttribute("url", "/download-file/test/img.jpg");
    	return modelAndView;
    }
    
    
}
