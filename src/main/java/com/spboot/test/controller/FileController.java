package com.spboot.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.spboot.test.entity.FileInfo;
import com.spboot.test.service.FileService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j //마치 게터세터처럼..lombok이 해줌!
public class FileController {
   
	@Autowired
	private FileService fileService;
   @PostMapping("/file-info")
   public String upload(@ModelAttribute FileInfo fi) {
      
		log.info("fi=>{}",fi);
      log.info("@Slf4j어노테이션이 있으면 log변수 자동으로 만들어줌");
      fileService.saveFileInfo(fi);
      return "views/file-upload";
   }
}