class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];

        Stack<Integer> check = new Stack<>(); 

        check.push(0);

        for(int i = 1; i < temperatures.length; i++){
            
            while(!check.isEmpty() && temperatures[i] > temperatures[check.peek()]){
                res[check.peek()] = i - check.pop();  
            }
            check.push(i);       
        }
        
        while(!check.isEmpty()){
            res[check.peek()] = 0;
            check.pop();
        }

        return res;
        

        
    }
}