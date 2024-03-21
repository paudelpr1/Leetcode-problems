class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> store = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (!(tokens[i].matches("[-+*/]"))) {
                int num = Integer.parseInt(tokens[i]);
                store.push(num);
            } else {
                if (store.size() >= 2) {
                    int calc = 0;
                    switch (tokens[i]) {
                        case "+":
                            calc = store.pop() + store.pop();
                            break;
                        case "-":
                            int temp1 = store.pop();
                            int temp2 = store.pop();
                            calc = temp2 - temp1;
                            break;
                        case "*":
                            calc = store.pop() * store.pop();
                            break;
                        case "/":
                            temp1 = store.pop();
                            temp2 = store.pop();
                            calc = temp2 / temp1;
                            break;
                        default:
                    }
                    store.push(calc);

                }
            }

        }
        int res = store.peek();
        return res;

    }
}