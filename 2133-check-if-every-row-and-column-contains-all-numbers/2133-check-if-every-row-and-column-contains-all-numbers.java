class Solution {
    public boolean checkValid(int[][] matrix) {

        for(int i = 0; i < matrix.length; i++){
            Set<Integer> row = new HashSet<>();
            Set<Integer> column = new HashSet<>();
            for(int j = 0; j < matrix.length; j++){
                
                row.add(matrix[i][j]);
                column.add(matrix[j][i]);

               
            }

            if(row.size()!= matrix.length || column.size() != matrix.length){
                return false;
            }
        }

        return true;
        
    }
}