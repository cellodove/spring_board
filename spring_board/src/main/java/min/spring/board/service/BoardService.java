package min.spring.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import min.spring.board.dao.BoardDAO;
import min.spring.board.model.BoardDTO;

@Service
public class BoardService {

	@Autowired
	private BoardDAO boardDAO;
	
	public List<BoardDTO> list() {
		return boardDAO.getBoardList();
	}
	
	
	
}
