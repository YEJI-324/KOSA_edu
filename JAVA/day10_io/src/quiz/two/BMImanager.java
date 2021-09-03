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
		System.out.println("?�비만도 ?��?��?��베이?�� ?��?��?�� ?��?�� 것을 ?��?��?��?��?��??");
		int select = 0;
		while (true) {
			System.out.println("-----------------------------------------");
			do {
				System.out.print("?��?��?�� ?��?��?��?��?��.\n(1.개인?���? 추�? | 2.개인?���? ?��?�� | 3.?��?��출력 | 4.종료) : ");
				try {
					select = scan.nextInt();
				} catch (Exception e) {
					System.out.println("?��?���? ?��?��?��?��?��");
				} 
			} while (select !=1 && select !=2 && select !=3 && select !=4);
			
			switch (select) {
				case 1 : addPerson(BMIList, personalData); 	break;
				case 2 : delPerson(BMIList); break;
				case 3 : print2File(BMIList); break;
				case 4 : System.out.println("----------?��?��?��?�� 종료?��?��?��----------"); System.exit(0);
				default : System.out.println("?��?�� ?��?��?��?��?��");
			} while(select!=1 && select!=2 && select!=3 && select!=4);
		}// out while end
	}

	
	public HashMap addPerson(HashMap bMIList, ArrayList personalData) {
		
		personalData = new ArrayList();
		System.out.print("?���? : ");		name = scan.next();	
		while(BMIList.containsKey(name)) {
			System.out.print("?���? 존재?��?�� ?��름이�?�? ?��?���? 붙여주시�? 바랍?��?��(?��:park1, kim90) : ");
			name = scan.next();	
		}
		System.out.print("몸무�?(kg) : ");		weight = scan.nextInt();	personalData.add(weight);
		System.out.print("?��(cm) : ");			height = scan.nextInt();	personalData.add(height);
		System.out.print("비만?�� : ");		
		// 비만?�� 측정 계산?��
			BMI= weight/((height/100.0)*(height/100.0));	
			personalData.add(BMI);
			
			if(BMI < 18.5) BMIresult = "??체중";
				else if ((BMI>=18.5) && (BMI<=23) ) BMIresult = "?��?��"; 
				else BMIresult = "과체�?";
			System.out.println("BMI = "+ BMI + " / " + BMIresult);
			
			personalData.add(BMIresult);
			
		BMIList.put(name,personalData);
		return BMIList;
	}
	
	public HashMap delPerson(HashMap bMIList) {
		System.out.print("�??�� ?��름을 ?��?��?��?��?�� : ");
		String dname = scan.next();
		if (BMIList.containsValue(dname)) {
			BMIList.remove(dname);/////
			System.out.println("?��?���? ?��료되?��?��?��?��.");
		} else {
			System.out.println("?��?�� ?��름이 존재?���? ?��?��?��?��.");
		}
		
		return BMIList;
	}
	
	public void print2File(HashMap bMIList) {

		//Iterator it = BMIList.entrySet().iterator();  ///?��기도 �?경해�?
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
			//Entry entry = (Entry)it.next();  //Entry ?��?��?���?...
			Map.Entry entry = (Map.Entry) it.next();
			System.out.println("?���? : " + entry.getKey() );  //+ ", Entry Value: " + entry.getValue());
			 ////////////////////////////////////////////////////////////////////////////   
		    personalData = (ArrayList) it.next();
		    for (int i=0; i<personalData.size();i++) {
		    	
		    	 switch (i) {
		    	 case 0 :  System.out.println("몸무�? : " + personalData.get(i) + "kg" );	break;
		    	 case 1 :  System.out.println("?�� : " + personalData.get(i) + "cm" );		break;
		    	 case 2 :  System.out.printf("비만?�� : " + personalData.get(i),"%.2f");	break;
		    	 case 3 :  System.out.println("\n?��?�� : <" + personalData.get(i) + ">" );	
		    	 }
		     }
		     
		 }
	}

}
