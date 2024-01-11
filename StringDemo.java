package String_Ex;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1="Hello";//heap
        String s2="Hello";
      
       
   if(s1==s2) {
	   System.out.println("both memory location are same");
   }else {
	   System.out.println("location are not same");
   }
 //to check content
    if(s1.equals(s2))   {
    	System.out.println("content are same");
    }else {
    	System.out.println("content are not same");
    }
	}

}
