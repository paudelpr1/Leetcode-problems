class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> res = new ArrayList<>();  

        backtrack(0, 0, n, "", res);
        
        return res;
    }

    static void backtrack(int openN, int closeN, int n, String store, List<String> res){
            if(openN == closeN && openN == n){
                
                res.add(store);
                return; 
            }
            
            if(openN < n){
               
                backtrack(openN+1, closeN, n, store + "(", res);
            }

            if(closeN < openN){
                
                backtrack(openN, closeN+1, n, store + ")", res);
            }

    }
}