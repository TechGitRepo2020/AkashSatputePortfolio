
class Practise
{

	public static String reverseString(String s){
        String rev="";

		for(int i=s.length()-1;i>=0;i--){
			rev=rev+s.charAt(i);
		}

		if(rev.equals(s))
			return "String is palindrome";
		else
			return "String is not palindrome";
	}


	public static void main(String [] args){
		System.out.println(reverseString("Madam"));
	}
}