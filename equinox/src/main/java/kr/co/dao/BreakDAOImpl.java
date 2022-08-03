package kr.co.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.vo.BreakVO;
import kr.co.vo.SearchCriteria;

@Repository
public class BreakDAOImpl implements BreakDAO {

	@Inject
	private SqlSession sqlSession;

	// 게시글 작성
	@Override
	public void write(BreakVO breakVO) throws Exception {
		sqlSession.insert("breakMapper.insert", breakVO);

	}

	// 게시물 목록 조회
	public List<BreakVO> listpage(SearchCriteria scri) throws Exception {
		
		List<BreakVO> list = sqlSession.selectList("breakMapper.listPage", scri);
		return list;
	}

	// 게시물 총 갯수
	@Override
	public int listCount(SearchCriteria scri) throws Exception {
		return sqlSession.selectOne("breakMapper.listCount", scri);
	}

	// 게시물 조회
	@Override
	public BreakVO read(int breakId) throws Exception {
		return sqlSession.selectOne("breakMapper.read", breakId);
	}

	// 게시물 수정
	@Override
	public void update(BreakVO breakVO) throws Exception {

		sqlSession.update("breakMapper.update", breakVO);
	}

	// 게시물 삭제
	@Override
	public void delete(int breakId) throws Exception {

		sqlSession.delete("breakMapper.delete", breakId);
	}

}