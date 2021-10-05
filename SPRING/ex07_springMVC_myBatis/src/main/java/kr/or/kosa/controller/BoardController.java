package kr.or.kosa.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.or.kosa.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value = "/selectAll.do", method=RequestMethod.GET) // url 형식
	public void selectAll(String searchCondition, String searchKeyword, Model model) { //model은 데이터 저장할 객체임
		// void면 메서드_이름.jsp 파일로 연결함.
		
		System.out.println(searchCondition);
		System.out.println(searchKeyword);
		
		HashMap map = new HashMap();
		map.put("searchCondition", searchCondition);
		map.put("searchKeyword", searchKeyword);
//		map.put("writer", "김예지");
//		map.put("title", "제목");
		
		model.addAttribute("boardList", boardService.selectAll(map));
//		return "getBoardList";
	}
}
