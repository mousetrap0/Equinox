package kr.co.controller;

import java.util.Date;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.service.BreakService;
import kr.co.vo.BreakVO;
import kr.co.vo.PageMaker;
import kr.co.vo.SearchCriteria;

@Controller
@RequestMapping("/break/*")
@CrossOrigin(origins = "http://localhost:3000")
public class BreakController {

	private static final Logger logger = LoggerFactory.getLogger(BreakController.class);
	
	@Inject
	BreakService service;
	
	
	// 게시판 글 작성 화면
	@RequestMapping(value = "/break/writeView", method = RequestMethod.GET)
	public void writeView() throws Exception{
		logger.info("writeView");
		
	}
	// 게시판 글 작성
	@RequestMapping(value = "/break/write", method = RequestMethod.POST)
	public String write(BreakVO breakVO) throws Exception{
		logger.info("write");
		
		Date date = new Date();
		breakVO.setCreateTime(date);
		//TODO: 나중에 로그인 기능 개발 후 변경 필
		breakVO.setCreateUser("ADMIN");
		breakVO.setUpdateTime(date);
		//TODO: 나중에 로그인 기능 개발 후 변경 필
		breakVO.setUpdateUser("ADMIN");
		
		
		service.write(breakVO);
		
		return "redirect:/";
	}
		
	// 게시판 목록 조회
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model, @ModelAttribute("scri") SearchCriteria scri) throws Exception{
		logger.info("list");
		
		model.addAttribute("list", service.listpage(scri));
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(scri);
		pageMaker.setTotalCount(service.listCount(scri));
		model.addAttribute("pageMaker", pageMaker);
		
		return "break/list";
		
	}
	
	// 게시판 조회
	@RequestMapping(value = "/readView", method = RequestMethod.GET)
	public String read(BreakVO breakVO, Model model) throws Exception{
		logger.info("read");
		
		model.addAttribute("read", service.read(breakVO.getBreakId()));
		
		return "break/readView";
	}
	
	// 게시판 수정뷰
	@RequestMapping(value = "/updateView", method = RequestMethod.GET)
	public String updateView(BreakVO breakVO, Model model) throws Exception{
		logger.info("updateView");
		
		model.addAttribute("update", service.read(breakVO.getBreakId()));
		
		return "break/updateView";
	}
	
	// 게시판 수정
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(BreakVO breakVO) throws Exception{
		logger.info("update");
		
		service.update(breakVO);
		
		return "redirect:/break/list";
	}

	// 게시판 삭제
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String delete(BreakVO breakVO) throws Exception{
		logger.info("delete");
		
		service.delete(breakVO.getBreakId());
		
		return "redirect:/break/list";
	}
}