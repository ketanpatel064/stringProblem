import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSecondStringProblem {
	
	StringProblem sp = new StringProblem();
	
	/*
	 * Postitive test case
	 */
	@Test
	public void testSecondStringProblemPositive(){
		String s = sp.removeCharFromStringMethod("stringProblem", 'r');
		Assert.assertEquals(s, "stingPoblem");
	}
	
	
	/*
	 * negative test cases 1: String equals empty
	 */
	@Test
	public void testSecondStringProblemWithEmpty(){
		String s = sp.removeCharFromStringMethod("", 'a');
		Assert.assertEquals(s, "");
	}
	
	
	/*
	 * negative test cases 2: String equals null
	 */
	@Test
	public void testSecondStringProblemWithNull(){
		String s = sp.removeCharFromStringMethod(null, 'a');
		Assert.assertEquals(s, null);
	}
	
	/*
	 * negative test cases 3: String equals null
	 */
	@Test
	public void testSecondStringProblemWithNullChar(){
		String s = sp.removeCharFromStringMethod(null, null);
		Assert.assertEquals(s, null);
	}
	
	
	/*
	 * negative test cases 4: String equals null
	 */
	@Test
	public void testSecondStringProblemWithNullChar2(){
		String s = sp.removeCharFromStringMethod("abc", null);
		Assert.assertEquals(s, "abc");
	}
	
	
	/*
	 * negative test cases 5
	 */
	@Test
	public void testSecondStringProblemWithSpecialChar(){
		String s = sp.removeCharFromStringMethod("stringProblem", '$');
		Assert.assertEquals(s, "stringProblem");
	}
	
}
