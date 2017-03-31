
public class StringProblem {
		
	public String removeCharFromStringIterate(String s, Character c){
		if(s == null || s.length() == 0 || c == null){
			return s;
		}
		StringBuilder res = new StringBuilder();
		for(int i = 0; i < s.length(); i++){
			char temp = s.charAt(i);
			if(temp != c){
				res.append(temp);
			}
		}
		return res.toString();
	}
	
	public String removeCharFromStringMethod(String s, Character c){
		if(s == null || s.length() == 0 || c == null){
			return s;
		}
		return s.replace(c.toString(), "");
	}
	
}
