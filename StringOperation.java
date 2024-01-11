package String_Ex;

public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String Concate using function
		 String s1="Hello";//heap
	     String s2="Guys";
	     String s3=s1.concat(s2);
	     System.out.println(s3);
	     //using Pluse symbol
	     String s4=s1 +s2 ;
	     System.out.println(s1 +s2+2+3);
	     System.out.println((2+3)+s1 +s2+(2+3));
	     System.out.println(2+3+s1 +s2);
	     System.out.println(s4);
	     //compare to ==
	     System.out.println(s1==s2);
	     //compare to
	     System.out.println(s1.compareTo(s2));
	     //equalto
	     System.out.println(s1.equals(s2));
	     
	     String s6="A";//ascii value 65(65 to 90 A-Z)
	     String s7="a";//ascii value 97(97 to 122 a-z)
	    // if(s6.compareTo(s7)>0) {//s6==s7,equals 0,
	    	                     //s6>s7,1
	    	                     //s6<s7,-1
	    	 
	    	 
	    // }
	     
	     System.out.println(s7.compareTo(s6));  //32
	     System.out.println(s6.compareTo(s7)); //-32

	}

}
