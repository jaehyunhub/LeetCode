class Solution {
    public boolean isValid(String s) {
        
        if(s == null || (s.length() % 2) == 1 ) return false;

        Map<Character, Character> pair = new HashMap<>();
        pair.put(')','(');
        pair.put(']','[');
        pair.put('}','{');

        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }
            else{
                if(stack.isEmpty() || stack.pop() != pair.get(c)){
                    return false;
                }
            }
        }

        return stack.isEmpty();
     

    }
}