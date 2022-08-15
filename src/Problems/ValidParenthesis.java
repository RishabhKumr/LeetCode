package Problems;

public class ValidParenthesis {
	
    public boolean isValid(String s) {
        if(s.length() % 2 != 0)
        {
            return false;
        }
        Stack<Character> stack = new Stack();
        for(char c: s.toCharArray())
        {
            if(c=='(' || c == '{' || c == '[')
            {
                stack.push(c);
            }
            else if( c == ')' && !stack.isEmpty() && stack.peek().equals('(')){
                stack.pop();
            }
            else if( c == '}' && !stack.isEmpty() && stack.peek().equals('{')){
                stack.pop();
            }
            else if( c == ']' && !stack.isEmpty() && stack.peek().equals('[')){
                stack.pop();
            }
            else
            {
                return false;
            }
        }
        return stack.isEmpty();
    }

}
