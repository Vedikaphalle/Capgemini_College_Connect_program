package String_Ex;

public class StringNewKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("hello");
		String s2  =new String("hello");
		if(s1==s2) {
			   System.out.println("both memory location are same");
		   }else {
			   System.out.println("location are not same");
		   }
		//to check content
		    if(s1.equals(s2))   {
		    	System.out.println("both string are same");
		    }else {
		    	System.out.println("they are not same");
		    }
	}

}
