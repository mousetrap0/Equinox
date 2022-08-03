package kr.co.service;

import java.util.List;

import kr.co.vo.BreakVO;
import kr.co.vo.SearchCriteria;

public interface BreakService {

	// 게시글 작성
	public void write(BreakVO breakVO) throws Exception;
	
	// 게시물 목록 조회
	public List<BreakVO> listpage(SearchCriteria scri) throws Exception;
	
	// 게시물 총 갯수
	public int listCount(SearchCriteria scri) throws Exception;
	
	// 게시물 목록 조회
	public BreakVO read(int breakId) throws Exception;
	
	// 게시물 수정
	public void update(BreakVO breakVO) throws Exception;
	
	// 게시물 삭제
	public void delete(int breakId) throws Exception;
}