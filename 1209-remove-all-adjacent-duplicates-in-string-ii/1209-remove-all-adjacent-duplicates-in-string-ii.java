class Solution {
    public String removeDuplicates(String s, int k) {

        Stack<int[]> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {


            if(!stack.empty() && stack.peek()[0] == s.charAt(i)) {

                stack.peek()[1]++;

                if(stack.peek()[1] == k) {
                    stack.pop();
                }

            } else {

                stack.push(new int[]{s.charAt(i), 1});
            }
        }

        StringBuilder res = new StringBuilder();

        while(!stack.empty()) {

            int[] pair = stack.pop();

            for(int i = 0; i < pair[1]; i++) {
                res.append((char)pair[0]);
            }
        }

        return res.reverse().toString();
    }
}