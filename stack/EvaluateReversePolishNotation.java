class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {

        HashSet<String> set = new HashSet<>();
        set.add("+");
        set.add("-");
        set.add("*");
        set.add("/");

        Deque<Integer> stack = new ArrayDeque<>();

        for (String token : tokens) {
            if (!set.contains(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int rightOperand = stack.pop();
                int leftOperand = stack.pop();
                int result = 0;
                if (token.equals("+")) {
                    result = leftOperand + rightOperand;
                } else if (token.equals("-")) {
                    result = leftOperand - rightOperand;
                } else if (token.equals("*")) {
                    result = leftOperand * rightOperand;
                } else {
                    result = leftOperand / rightOperand;
                }
                stack.push(result);
            }
        }

        return stack.peek();

    }
}