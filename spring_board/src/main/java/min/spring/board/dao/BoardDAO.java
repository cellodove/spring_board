package min.spring.board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Repository;

import min.spring.board.model.BoardDTO;

@Repository
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class BoardDAO {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public List<BoardDTO> getBoardList() {
		return sqlSessionTemplate.selectList("getBoardList");
		
	}
	
	
	
	
	
	
}
