import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFirstStringProblem {
	
StringProblem sp = new StringProblem();
	
	/*
	 * Postitive test case
	 */
	@Test
	public void testFirstStringProblemPositive(){
		String s = sp.removeCharFromStringMethod("stringProblem", 'r');
		Assert.assertEquals(s, "stingPoblem");
	}
	
	
	/*
	 * negative test cases 1: String equals empty
	 */
	@Test
	public void testFirstStringProblemWithEmpty(){
		String s = sp.removeCharFromStringIterate("", 'a');
		Assert.assertEquals(s, "");
	}
	
	
	/*
	 * negative test cases 2: String equals null
	 */
	@Test
	public void testFirstStringProblemWithNull(){
		String s = sp.removeCharFromStringIterate(null, 'a');
		Assert.assertEquals(s, null);
	}
	
	/*
	 * negative test cases 3: String equals null
	 */
	@Test
	public void testFirstStringProblemWithNullChar(){
		String s = sp.removeCharFromStringIterate(null, null);
		Assert.assertEquals(s, null);
	}
	
	
	/*
	 * negative test cases 4: String equals null
	 */
	@Test
	public void testFirstStringProblemWithNullChar2(){
		String s = sp.removeCharFromStringIterate("abc", null);
		Assert.assertEquals(s, "abc");
	}
	
	
	/*
	 * negative test cases 5
	 */
	@Test
	public void testFirstStringProblemWithSpecialChar(){
		String s = sp.removeCharFromStringIterate("stringProblem", '$');
		Assert.assertEquals(s, "stringProblem");
	}
	
	
}
