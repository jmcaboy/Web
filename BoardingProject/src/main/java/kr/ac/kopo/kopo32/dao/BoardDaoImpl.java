package kr.ac.kopo.kopo32.dao;

import java.util.List;
import kr.ac.kopo.kopo32.domain.Board;

public interface BoardDaoImpl {
	//C
	void create(Board board);
	//R
	Board selectOne(int id);//하나 가져오기
	List<Board> seelctAll();//여러개 가져오기
	//U
	void update(Board board);
	//D
	void delete(Board board);
}
