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
		System.out.println("?»λΉλ§λ ?°?΄?°λ² μ΄?€ ?Ό?°? ?€?  κ²μ ???©??€??");
		int select = 0;
		while (true) {
			System.out.println("-----------------------------------------");
			do {
				System.out.print("??? ? ???Έ?.\n(1.κ°μΈ? λ³? μΆκ? | 2.κ°μΈ? λ³? ?­?  | 3.??ΌμΆλ ₯ | 4.μ’λ£) : ");
				try {
					select = scan.nextInt();
				} catch (Exception e) {
					System.out.println("?«?λ§? ?? ₯??Έ?");
				} 
			} while (select !=1 && select !=2 && select !=3 && select !=4);
			
			switch (select) {
				case 1 : addPerson(BMIList, personalData); 	break;
				case 2 : delPerson(BMIList); break;
				case 3 : print2File(BMIList); break;
				case 4 : System.out.println("----------??€?? μ’λ£?©??€----------"); System.exit(0);
				default : System.out.println("?€? ?? ₯??Έ?");
			} while(select!=1 && select!=2 && select!=3 && select!=4);
		}// out while end
	}

	
	public HashMap addPerson(HashMap bMIList, ArrayList personalData) {
		
		personalData = new ArrayList();
		System.out.print("?΄λ¦? : ");		name = scan.next();	
		while(BMIList.containsKey(name)) {
			System.out.print("?΄λ―? μ‘΄μ¬?? ?΄λ¦μ΄λ―?λ‘? ?«?λ₯? λΆμ¬μ£ΌμκΈ? λ°λ??€(?:park1, kim90) : ");
			name = scan.next();	
		}
		System.out.print("λͺΈλ¬΄κ²?(kg) : ");		weight = scan.nextInt();	personalData.add(weight);
		System.out.print("?€(cm) : ");			height = scan.nextInt();	personalData.add(height);
		System.out.print("λΉλ§? : ");		
		// λΉλ§? μΈ‘μ  κ³μ°?
			BMI= weight/((height/100.0)*(height/100.0));	
			personalData.add(BMI);
			
			if(BMI < 18.5) BMIresult = "??μ²΄μ€";
				else if ((BMI>=18.5) && (BMI<=23) ) BMIresult = "? ?"; 
				else BMIresult = "κ³Όμ²΄μ€?";
			System.out.println("BMI = "+ BMI + " / " + BMIresult);
			
			personalData.add(BMIresult);
			
		BMIList.put(name,personalData);
		return BMIList;
	}
	
	public HashMap delPerson(HashMap bMIList) {
		System.out.print("μ§??Έ ?΄λ¦μ ?? ₯??Έ? : ");
		String dname = scan.next();
		if (BMIList.containsValue(dname)) {
			BMIList.remove(dname);/////
			System.out.println("?­? κ°? ?λ£λ??΅??€.");
		} else {
			System.out.println("?΄?Ή ?΄λ¦μ΄ μ‘΄μ¬?μ§? ??΅??€.");
		}
		
		return BMIList;
	}
	
	public void print2File(HashMap bMIList) {

		//Iterator it = BMIList.entrySet().iterator();  ///?κΈ°λ λ³?κ²½ν΄λ΄?
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
			//Entry entry = (Entry)it.next();  //Entry ?¬?©?΄λ΄?...
			Map.Entry entry = (Map.Entry) it.next();
			System.out.println("?΄λ¦? : " + entry.getKey() );  //+ ", Entry Value: " + entry.getValue());
			 ////////////////////////////////////////////////////////////////////////////   
		    personalData = (ArrayList) it.next();
		    for (int i=0; i<personalData.size();i++) {
		    	
		    	 switch (i) {
		    	 case 0 :  System.out.println("λͺΈλ¬΄κ²? : " + personalData.get(i) + "kg" );	break;
		    	 case 1 :  System.out.println("?€ : " + personalData.get(i) + "cm" );		break;
		    	 case 2 :  System.out.printf("λΉλ§? : " + personalData.get(i),"%.2f");	break;
		    	 case 3 :  System.out.println("\n??  : <" + personalData.get(i) + ">" );	
		    	 }
		     }
		     
		 }
	}

}
