package com.oneul.web.controller;

import java.io.File;
import java.io.IOException;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.oneul.web.entity.CalendarEmotion;
import com.oneul.web.entity.FreeDiary;
import com.oneul.web.entity.FreeDiaryComment;
import com.oneul.web.entity.GratitudeDiary;
import com.oneul.web.entity.Member;
import com.oneul.web.entity.Question;
import com.oneul.web.service.CalendarEmotionService;
import com.oneul.web.service.FreeDiaryCommentService;
import com.oneul.web.service.FreeDiaryCommentServiceImp;
import com.oneul.web.service.FreeDiaryService;
import com.oneul.web.service.MemberService;
import com.oneul.web.service.QuestionService;

@Controller
@RequestMapping("/")
public class TestController {


	@RequestMapping("hello")
	public String list(Model model, HttpServletRequest request) {

		return "hello";
	}


}
