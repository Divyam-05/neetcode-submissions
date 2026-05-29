class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (Character a : s.toCharArray()) {

            if (a == '(' || a == '{' || a == '[') {
                stack.push(a);

            }

            else {
                if (stack.isEmpty()) {
                    return false;
                }

                if (a == ')' || a == '}' || a == ']') {
                    char b = stack.peek();

                    if (a == ')' && b == '(') {
                        stack.pop();
                    }

                    else if (a == '}' && b == '{') {
                        stack.pop();
                    }

                   else if (a == ']' && b == '[') {
                        stack.pop();
                    }

                    else {
                        return false;
                    }

                }

            }

        }

        return stack.isEmpty();

    } 
    }

