package kr.ac.kopo.kopo32.dao;

import kr.ac.kopo.kopo32.domain.Board;

public class BoardDaoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board board = new Board();
	      board.setId(1);
	      board.setTitle("abcd");
	      BoardDao boardDao = new BoardDao();
	      boardDao.create(board);
	}

}
