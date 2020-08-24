package min.spring.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import min.spring.board.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("list", boardService.list());
		return "./getBoardList/list";
	}
	
	// 데이터의 입력 화면 뷰를 실행하며 http://localhost/dept/insert의 웹주소가 된다.
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert( ) {
	return "./boardInsert/insert";
	}
	

	
	
}
