// my code, runtime = 14ms
class Solution {
    public String removeOuterParentheses(String s) {

        Stack<Character> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();
        String ans = "";

        for(int i = 0; i<s.length();i++){

            if(s.charAt(i) == '('){

                stack.push(s.charAt(i));
                sb.append(s.charAt(i));

            }else {

                sb.append(s.charAt(i));
                stack.pop();

                if(stack.isEmpty()){

                    String temp = sb.toString();
                    temp = sb.substring(1,sb.length()-1);
                    ans+=temp;

                    sb.setLength(0);

                }

            }

        }

        return ans;
    }
}

// 2ms code, not mine (obv sad). Here, stack is implemented by the user by creating one himself reather than using the built-in one.

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int opened = 0;
        for (char c : s.toCharArray()) {
            if ((c == '(' && opened++ > 0) ||   (c == ')' && opened-- > 1)) {
                result.append(c);
            }
        }
        return result.toString();
    }
}
