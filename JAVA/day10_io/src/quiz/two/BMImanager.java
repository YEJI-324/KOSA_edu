package quiz.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class BMImanager extends BMI { //

	Scanner scan = new Scanner(System.in);
	
	public BMImanager() {
		System.out.println("?»ë¹„ë§Œë„ ?°?´?„°ë² ì´?Š¤ ?„¼?„°?— ?˜¤?‹  ê²ƒì„ ?™˜?˜?•©?‹ˆ?‹¤??");
		int select = 0;
		while (true) {
			System.out.println("-----------------------------------------");
			do {
				System.out.print("?‘?—…?„ ?„ ?ƒ?•˜?„¸?š”.\n(1.ê°œì¸? •ë³? ì¶”ê? | 2.ê°œì¸? •ë³? ?‚­? œ | 3.?ŒŒ?¼ì¶œë ¥ | 4.ì¢…ë£Œ) : ");
				try {
					select = scan.nextInt();
				} catch (Exception e) {
					System.out.println("?ˆ«?ë§? ?…? ¥?•˜?„¸?š”");
				} 
			} while (select !=1 && select !=2 && select !=3 && select !=4);
			
			switch (select) {
				case 1 : addPerson(BMIList, personalData); 	break;
				case 2 : delPerson(BMIList); break;
				case 3 : print2File(BMIList); break;
				case 4 : System.out.println("----------?‹œ?Š¤?…œ?„ ì¢…ë£Œ?•©?‹ˆ?‹¤----------"); System.exit(0);
				default : System.out.println("?‹¤?‹œ ?…? ¥?•˜?„¸?š”");
			} while(select!=1 && select!=2 && select!=3 && select!=4);
		}// out while end
	}

	
	public HashMap addPerson(HashMap bMIList, ArrayList personalData) {
		
		personalData = new ArrayList();
		System.out.print("?´ë¦? : ");		name = scan.next();	
		while(BMIList.containsKey(name)) {
			System.out.print("?´ë¯? ì¡´ì¬?•˜?Š” ?´ë¦„ì´ë¯?ë¡? ?ˆ«?ë¥? ë¶™ì—¬ì£¼ì‹œê¸? ë°”ë?‹ˆ?‹¤(?˜ˆ:park1, kim90) : ");
			name = scan.next();	
		}
		System.out.print("ëª¸ë¬´ê²?(kg) : ");		weight = scan.nextInt();	personalData.add(weight);
		System.out.print("?‚¤(cm) : ");			height = scan.nextInt();	personalData.add(height);
		System.out.print("ë¹„ë§Œ?„ : ");		
		// ë¹„ë§Œ?„ ì¸¡ì • ê³„ì‚°?‹
			BMI= weight/((height/100.0)*(height/100.0));	
			personalData.add(BMI);
			
			if(BMI < 18.5) BMIresult = "??ì²´ì¤‘";
				else if ((BMI>=18.5) && (BMI<=23) ) BMIresult = "? •?ƒ"; 
				else BMIresult = "ê³¼ì²´ì¤?";
			System.out.println("BMI = "+ BMI + " / " + BMIresult);
			
			personalData.add(BMIresult);
			
		BMIList.put(name,personalData);
		return BMIList;
	}
	
	public HashMap delPerson(HashMap bMIList) {
		System.out.print("ì§??š¸ ?´ë¦„ì„ ?…? ¥?•˜?„¸?š” : ");
		String dname = scan.next();
		if (BMIList.containsValue(dname)) {
			BMIList.remove(dname);/////
			System.out.println("?‚­? œê°? ?™„ë£Œë˜?—ˆ?Šµ?‹ˆ?‹¤.");
		} else {
			System.out.println("?•´?‹¹ ?´ë¦„ì´ ì¡´ì¬?•˜ì§? ?•Š?Šµ?‹ˆ?‹¤.");
		}
		
		return BMIList;
	}
	
	public void print2File(HashMap bMIList) {

		//Iterator it = BMIList.entrySet().iterator();  ///?š”ê¸°ë„ ë³?ê²½í•´ë´?
		//Iterator it = bMIList.entrySet().iterator();
		//Set key = bMIList.keySet();
				
		 Set<Entry<String,String>> entrySet = BMIList.entrySet();
		 Iterator<Entry<String, String>> it = entrySet.iterator();
///////////////////////////////////////////////////////////////
		//Entry entry = (Entry)it.next();
		//Entry entry = (Entry)BMIList.keySet().iterator().next();
		//Entry entry = (Entry)BMIList.keySet();
				
		
		//System.out.println("000000 " + key);
		//for (int i = 0; i < BMIList.keySet().size(); i++) {
				//System.out.println(BMIList.keySet().iterator().next());
				//System.out.println(key);
		//}
		
	/*	for (Object mapkey :  BMIList.keySet()) { //for (Object mapkey :  bMIList.keySet()){
			System.out.println("key:"+mapkey+",value:"+bMIList.get(mapkey));
		}*/
		
		//System.out.println("bMIList.keySet().iterator().next() : " + bMIList.keySet().iterator().next() );
///////////////////////////////////////////////////////////////
	
		while(it.hasNext()) {
			System.out.println("----------------------");
			////////////////////////////////////////////////////////
			//Entry entry = (Entry)it.next();  //Entry ?‚¬?š©?•´ë´?...
			Map.Entry entry = (Map.Entry) it.next();
			System.out.println("?´ë¦? : " + entry.getKey() );  //+ ", Entry Value: " + entry.getValue());
			 ////////////////////////////////////////////////////////////////////////////   
		    personalData = (ArrayList) it.next();
		    for (int i=0; i<personalData.size();i++) {
		    	
		    	 switch (i) {
		    	 case 0 :  System.out.println("ëª¸ë¬´ê²? : " + personalData.get(i) + "kg" );	break;
		    	 case 1 :  System.out.println("?‚¤ : " + personalData.get(i) + "cm" );		break;
		    	 case 2 :  System.out.printf("ë¹„ë§Œ?„ : " + personalData.get(i),"%.2f");	break;
		    	 case 3 :  System.out.println("\n?Œ? • : <" + personalData.get(i) + ">" );	
		    	 }
		     }
		     
		 }
	}

}
