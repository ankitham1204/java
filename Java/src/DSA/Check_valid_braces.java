package DSA;
import java.util.Stack;
public class Check_valid_braces {
	static String isValidate(String s) {
		if(s.length()%2!=0) {
			return "invalid";
		}
		Stack <Character>st=new Stack<>();
		for(char ch:s.toCharArray()) {
		if(ch=='('||ch=='{'||ch=='[') {
			st.push(ch);
		
		}else if(st.isEmpty()) {
			return "invalid";
		}else {
			char val=st.pop();
			if((ch==')'&& val!='(')||
			  (ch==']'&& val!='[')||
			  (ch=='}'&& val!='{')) {
			  return "invalid";
			}
		}
	}
	
	if(st.isEmpty()) {
		return "valid";
	}else {
		return "invalid";
	}
	}
public static void main(String[] args) {
	String s="{[()]}";
	System.out.println(isValidate(s));
}
}