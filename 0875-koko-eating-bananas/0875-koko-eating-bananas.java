class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Integer.MIN_VALUE; 
        

        for(int i = 0; i <piles.length; i++)
        {
            right = Math.max(right, piles[i]);
        }
        int result = right;
        while(left <= right)
        {
            int mid = left + (right-left)/2; 
            int sum = 0;
            for(int i = 0; i<piles.length; i++)
            {
                sum += (Math.ceil((double)piles[i]/mid)); 
                
            }
            if(sum <= h)
            {
                result = mid; 
                right = mid -1; 
            }
            else{
                left = mid+1; 
            }
        }

        return result;
    }

}