package edu.kosa.view;

import edu.kosa.dao.GiftDAO;
import edu.kosa.dao.GiftDAOImpl;
import edu.kosa.model.GiftVO;

import java.util.Scanner;

public class MainEntry { // View
	public static void main(String[] args)  throws Exception {

		GiftDAO dao = new GiftDAOImpl();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("선택 : 1.insert / 2.selectAll / 3.select / 4.update / 5.delete / 6.exit");

		switch(sc.nextInt()) {
		case 1:
			GiftVO vo = new GiftVO();
			dao.insert(vo);
			
			System.out.println(vo.getGname() + " 추가 성공");
			break;
		
		case 2 :dao.selectAll();break;
		case 3 :System.out.println("gno select call"); break;
		case 4 :System.out.println("gno update call"); break;
		case 5 :System.out.println("gno delete call"); break;
		case 6 :
			System.out.println("exit"); 
			System.exit(0);
		default: System.out.println("없는 번호. 1~6 중에서 선택."); break;
		}
	}
}
