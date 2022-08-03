package kr.co.service;


import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.dao.BreakDAO;
import kr.co.vo.BreakVO;
import kr.co.vo.SearchCriteria;

@Service
public class BreakServiceImpl implements BreakService {

	@Inject
	private BreakDAO dao;
	
	// 게시글 작성
	@Override
	public void write(BreakVO breakVO) throws Exception {
		dao.write(breakVO);
	}
    //게시물 목록 조회
	@Override
	public List<BreakVO> listpage(SearchCriteria scri) throws Exception {
		// TODO Auto-generated method stub
		return dao.listpage(scri);
	}
	
    //게시물 총 갯수
	public int listCount(SearchCriteria scri) throws Exception {
		// TODO Auto-generated method stub
		return dao.listCount(scri);
	}
	
    //게시물 조회
	@Override
	public BreakVO read(int breakId) throws Exception {

		return dao.read(breakId);
	}
	//게시물 수정
	@Override
	public void update(BreakVO breakVO) throws Exception {

		dao.update(breakVO);
	}
    //게시물 삭제
	@Override
	public void delete(int breakId) throws Exception {
		
		dao.delete(breakId);
	}
}

