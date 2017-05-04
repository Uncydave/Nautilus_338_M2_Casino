
public class Assig2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		Assig2 test = new Assig2();
		test.testClass();
		
	}
	
	public void testClass()
	{
		System.out.println(getBet());
		System.out.println(pull());
	}
	
	public static int getBet()
	{
		/*
		 * This prompts the user for input and returns the 
		 * bet amount as a functional return.  It should 
		 * validate the amount before it returns and insist 
		 * on a legal bet (0 < bet < 100) until it gets one 
		 * from the user.  It must return the legal value to 
		 * the client and not take any other action besides 
		 * getting the legal amount.
		 */
		
		return 0;
		
	}

	public static TripleString pull()
	{
		/*
		 * 
		 */
		
		return new TripleString("string1","string2","string3");
	}

}

class TripleString 
{
	/*
	 * The first step in writing this 
	 * program is to create a simple, working 
	 * class TripleString.
	 */
	
	public static final int MAX_LEN = 20;
	
	private String string1;
	private String string2;
	private String string3;
	
	public TripleString()
	{
		string1 = "";
		string2 = "";
		string3 = "";
	}
	
	public TripleString(String str1, String str2, String str3) 
	{
		string1 = str1;
		string2 = str2;
		string3 = str3;
	}

	public String getString1() {
		return string1;
	}

	public void setString1(String string1) {
		this.string1 = string1;
	}

	public String getString2() {
		return string2;
	}

	public void setString2(String string2) {
		this.string2 = string2;
	}

	public String getString3() {
		return string3;
	}

	public void setString3(String string3) {
		this.string3 = string3;
	}

	@Override
	public String toString() {
		return "TripleString [string1=" + string1 + ", string2=" + string2 + ", string3=" + string3 + "]";
	}
	
	
	
}
