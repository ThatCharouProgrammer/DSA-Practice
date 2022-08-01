package GRIND_75;

import java.util.HashMap;
import java.util.Stack;

public class Q2_ValidParentheses {
    public boolean isValid(String s) {

        HashMap<Character, Character> match = new HashMap<>();

        match.put(')', '(');
        match.put(']', '[');
        match.put('}', '{');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                // add element to the stack
                stack.push(s.charAt(i));
                continue;
            }
            // if there were no parentheses in the string
            // if there is no match
            // then there are no valid parentheses
            if (stack.size() == 0 || match.get(s.charAt(i)) != stack.pop()){
                return false;
            }
        }

        // after checking through the string, if the stack is empty => valid parentheses
        if (stack.size() == 0)
        {
            return true;
        }

        return false;
    }

    public static void main(String[] args){

        // true test cases
        String s = "{}";
        String s2 = "()[]{}";
        String s4 = "([])";

        // false test cases
        String s3 = "(]";

        Q2_ValidParentheses obj = new Q2_ValidParentheses();

        System.out.println(obj.isValid(s));
        System.out.println(obj.isValid(s2));
        System.out.println(obj.isValid(s3));
        System.out.println(obj.isValid(s4));
    }
}

/*
* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false


Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
* */
