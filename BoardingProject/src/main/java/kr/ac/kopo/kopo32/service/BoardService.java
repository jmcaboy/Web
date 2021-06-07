package kr.ac.kopo.kopo32.service;

import java.util.List;

import kr.ac.kopo.kopo32.dao.BoardDao;
import kr.ac.kopo.kopo32.domain.Board;

public class BoardService implements BoardServiceImpl{
	
	private BoardDao boardDao = new BoardDao();
	
	@Override
	public void create(Board board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Board selectOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Board> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Board board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Board board) {
		// TODO Auto-generated method stub
		
	}
	
}
