package ex06.BreakContinue;

public class MultiBreak {

	public static void main(String[] args) {
		   boolean flag = true;

		      first : {    
		         second : {
		               third :    {

		                  int k = 100;
		                  System.out.println("Before the break");

		                  if( flag ) break second;   // break �ĺ���;   �ĺ��� ��ġ���� Ż�� 

		                  System.out.println("This won't execute ");

		            } // third end      
		               System.out.println("th160 ȱ��!!!");
		         } //second end
		            System.out.println("This is after second block");            
		      } // first end
		      System.out.println("dkjfksdjfksjdk38242934");   
	}
}
