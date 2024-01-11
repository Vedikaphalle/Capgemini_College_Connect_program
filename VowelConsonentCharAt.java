package String_Ex;

public class VowelConsonentCharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1="hello World";
      
		char[] c = s1.toCharArray();
		int vowel=0;
		
		for (int i = 0; i < s1.length(); i++) { 
            if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u') 
                vowel++; 
		}
  
	System.out.println("Vowels: " + vowel);
	}

}
