class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> store = new HashSet();

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){

                if(board[i][j] != '.'){
                    if((!store.add(board[i][j] + " in row " + i)) || 
                    (!store.add(board[i][j] + " in column " + j)) || 
                    (!store.add(board[i][j] + " in square box" + i/3 + "-" + j/3))){
                        return false;
                }

                }
                
                
                
            }
        }
        return true;
        
    }
}