package String_Ex;

public class SubStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello World";
		//s1="Hello World" 01234 5 678910
		System.out.println(s1.substring(1)); 
		System.out.println(s1.substring(1,9)); 
		//String is edubridge
		/*e
		 * ed
		 * edu
		 * edub
		 * edubr
		 * edubri
		 * edubrid
		 * edubridg
		 * edubridge
		 */
		String s2="edubridge";
		for(int i=0;i<s2.length();i++) {
			System.out.println(s2.substring(0,i+1)); 
			
		}
		System.out.println("reverse :");
		
		for(int i=0;i<s2.length();i++) {
			System.out.println(s2.substring(i)); 
			
		}
		
				System.out.println("pattren :");
		for(int i=s2.length()-1;i>=0;i--) {
			System.out.println(s2.substring(0,i+1)); 
		}
		for(int i=2;i<s2.length();i++) {
			System.out.println(s2.substring(0,i+1)); 
		}
		

	}

}
