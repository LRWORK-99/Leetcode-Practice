class validParenthesis(){
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();

        map.put('{', '}');
        map.put('(', ')');
        map.put('[', ']');

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                // If character is opener, put it into the stack
                stack.push(c);
            } else if (stack.isEmpty()) {
                // If character is closer, but stack is empty, return flase
                return false;
            } else { //If character is closer and stack is not empty
                if (map.get(stack.peek()).equals(c)) {
                    stack.pop();
                } else  {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}